package damai.com.sld4mvp.presenter;

import damai.com.sld4mvp.bean.User;
import damai.com.sld4mvp.model.IUserModel;
import damai.com.sld4mvp.model.UserModel;
import damai.com.sld4mvp.view.IUserView;

/**
 * @ClassName:
 * @Description:TODO()
 * @author:appdevzhang
 * @email:zhangzhongkai@damaiapp.com
 * @date:15/8/9 下午4:15
 */
public class UserPresenter {

    private IUserView mUserView;
    private IUserModel mUserModel;

    public UserPresenter(IUserView iUserView) {
        this.mUserView = iUserView;
        this.mUserModel = new UserModel();
    }

    public void saveUser(int id,String firstName,String lastName){
        mUserModel.setID(id);
        mUserModel.setFirstName(firstName);
        mUserModel.setLastName(lastName);
    }

    public void loadUser(int id){
        User user = mUserModel.load(id);
        mUserView.setFirstName(user.getFirstName());
        mUserView.setLastName(user.getLastName());
    }
}
