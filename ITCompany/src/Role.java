public class Role{
    private int roleId;
    private String roleTitle;

    public Role(int roleId, String roleTitle) {
        this.roleId = roleId;
        this.roleTitle = roleTitle;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleTitle() {
        return roleTitle;
    }

    public void setRoleTitle(String roleTitle) {
        this.roleTitle = roleTitle;
    }
}
