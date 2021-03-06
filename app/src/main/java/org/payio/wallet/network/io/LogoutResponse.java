package org.payio.wallet.network.io;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class LogoutResponse implements Serializable {
    @SerializedName("returnCode")
    private String returnCode;
    @SerializedName("returnMsg")
    private String returnMsg;

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }
}
