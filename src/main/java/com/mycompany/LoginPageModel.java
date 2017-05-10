package com.mycompany;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * @author sergey, created on 5/10/17.
 */
public class LoginPageModel implements Serializable {

    private static final long serialVersionUID = -140703239050028570L;

    private String userName;

    private String password;

    public LoginPageModel() {
    }

    public LoginPageModel(final String userName, final String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(final String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }



    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        LoginPageModel rhs = (LoginPageModel) obj;
        return new EqualsBuilder()
                .append(this.userName, rhs.userName)
                .append(this.password, rhs.password)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(userName)
                .append(password)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("userName", userName)
                .append("password", password)
                .toString();
    }
}
