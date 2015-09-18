package damai.com.sld4mvp.model;

import android.util.SparseArray;

import damai.com.sld4mvp.bean.User;

/**
 * @ClassName:
 * @Description:TODO()
 * @author:appdevzhang
 * @email:zhangzhongkai@damaiapp.com
 * @date:15/8/9 下午4:25
 */
public class UserModel implements IUserModel {

    private String mFirstName;
    private String mLastName;
    private int mID;
    private SparseArray<User> mArray = new SparseArray<>();


    public UserModel() {
    }

    @Override
    public void setID(int id) {
        mID = id;
    }

    @Override
    public void setFirstName(String firstName) {
        mFirstName =firstName;
    }

    @Override
    public void setLastName(String lastName) {
        mLastName = lastName;
        User mUser = new User(mFirstName,mLastName);
        mArray.append(mID,mUser);
    }

    @Override
    public User load(int id) {
        mID = id;
        User user = mArray.get(mID,new User("not found","not found"));
        return user;
    }
}
