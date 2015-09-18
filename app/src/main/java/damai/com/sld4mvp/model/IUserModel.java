package damai.com.sld4mvp.model;

import damai.com.sld4mvp.bean.User;

/**
 * @ClassName:
 * @Description:TODO()
 * @author:appdevzhang
 * @email:zhangzhongkai@damaiapp.com
 * @date:15/8/9 下午4:12
 */
public interface IUserModel {
    void setID(int id);

    void setFirstName(String firstName);

    void setLastName(String lastName);

//    void save(User user);

    User load(int id);
}
