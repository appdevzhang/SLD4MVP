package damai.com.sld4mvp.view;

/**
 * @ClassName:IUserLoginView
 * @Description:TODO()
 * @author:appdevzhang
 * @email:zhangzhongkai@damaiapp.com
 * @date:15/8/9 下午3:20
 */
public interface IUserView {

    int getID();

    String getFirstName();

    String getLastName();

    void setFirstName(String firstName);

    void setLastName(String lastName);

}
