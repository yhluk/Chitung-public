package lielietea.mirai.plugin.core.responder.universalrespond;

public class CustomizedConfig {
    String joinGroupText;
    String rejectGroupText;
    String onlineText;
    CustomizedConfig(){
        this.joinGroupText = "很高兴为您服务。在使用本 bot 之前，请仔细阅读下方的免责协议。";
    }

    public String getJoinGroupText() {
        return joinGroupText;
    }

    public void setJoinGroupText(String joinGroupText) {
        this.joinGroupText = joinGroupText;
    }

    public String getRejectGroupText() {
        return rejectGroupText;
    }

    public void setRejectGroupText(String rejectGroupText) {
        this.rejectGroupText = rejectGroupText;
    }

    public String getOnlineText() {
        return onlineText;
    }

    public void setOnlineText(String onlineText) {
        this.onlineText = onlineText;
    }
}

