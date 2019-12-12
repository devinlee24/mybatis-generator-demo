package com.devinlee.mybatisgeneratordemo.entity;

/**
 *
 * @mbg.generated do_not_delete_during_merge 2019-12-12 15:12:32
 */
public class SysMenu {
    /**
     * Database Column Remarks:
     *   sys_menu.SM_ID: 菜单ID
     */
    private String SM_ID;

    /**
     * Database Column Remarks:
     *   sys_menu.SAP_ID: 应用系统ID
     */
    private String SAP_ID;

    /**
     * Database Column Remarks:
     *   sys_menu.SM_NAME: 菜单名称
     */
    private String SM_NAME;

    /**
     * Database Column Remarks:
     *   sys_menu.SM_PARENTID: 父级菜单ID：0表示根菜单
     */
    private String SM_PARENTID;

    /**
     * Database Column Remarks:
     *   sys_menu.SM_ICON: 菜单图标样式
     */
    private String SM_ICON;

    /**
     * Database Column Remarks:
     *   sys_menu.SM_TYPE: 菜单类型：1菜单项 0分割线
     */
    private String SM_TYPE;

    /**
     * Database Column Remarks:
     *   sys_menu.SM_ACTION: 菜单动作
     */
    private String SM_ACTION;

    /**
     * Database Column Remarks:
     *   sys_menu.SM_ORDER: 菜单顺序
     */
    private Long SM_ORDER;

    /**
     * Database Column Remarks:
     *   sys_menu.SM_CONTENT: 备注
     */
    private String SM_CONTENT;

    /**
     * Database Column Remarks:
     *   sys_menu.SM_ADMIN: 1内置管理员菜单;0普通用户菜单
     */
    private String SM_ADMIN;

    /**
     * @return the value of sys_menu.SM_ID
     */
    public String getSM_ID() {
        return SM_ID;
    }

    /**
     * @param SM_ID the value for sys_menu.SM_ID
     */
    public void setSM_ID(String SM_ID) {
        this.SM_ID = SM_ID == null ? null : SM_ID.trim();
    }

    /**
     * @return the value of sys_menu.SAP_ID
     */
    public String getSAP_ID() {
        return SAP_ID;
    }

    /**
     * @param SAP_ID the value for sys_menu.SAP_ID
     */
    public void setSAP_ID(String SAP_ID) {
        this.SAP_ID = SAP_ID == null ? null : SAP_ID.trim();
    }

    /**
     * @return the value of sys_menu.SM_NAME
     */
    public String getSM_NAME() {
        return SM_NAME;
    }

    /**
     * @param SM_NAME the value for sys_menu.SM_NAME
     */
    public void setSM_NAME(String SM_NAME) {
        this.SM_NAME = SM_NAME == null ? null : SM_NAME.trim();
    }

    /**
     * @return the value of sys_menu.SM_PARENTID
     */
    public String getSM_PARENTID() {
        return SM_PARENTID;
    }

    /**
     * @param SM_PARENTID the value for sys_menu.SM_PARENTID
     */
    public void setSM_PARENTID(String SM_PARENTID) {
        this.SM_PARENTID = SM_PARENTID == null ? null : SM_PARENTID.trim();
    }

    /**
     * @return the value of sys_menu.SM_ICON
     */
    public String getSM_ICON() {
        return SM_ICON;
    }

    /**
     * @param SM_ICON the value for sys_menu.SM_ICON
     */
    public void setSM_ICON(String SM_ICON) {
        this.SM_ICON = SM_ICON == null ? null : SM_ICON.trim();
    }

    /**
     * @return the value of sys_menu.SM_TYPE
     */
    public String getSM_TYPE() {
        return SM_TYPE;
    }

    /**
     * @param SM_TYPE the value for sys_menu.SM_TYPE
     */
    public void setSM_TYPE(String SM_TYPE) {
        this.SM_TYPE = SM_TYPE == null ? null : SM_TYPE.trim();
    }

    /**
     * @return the value of sys_menu.SM_ACTION
     */
    public String getSM_ACTION() {
        return SM_ACTION;
    }

    /**
     * @param SM_ACTION the value for sys_menu.SM_ACTION
     */
    public void setSM_ACTION(String SM_ACTION) {
        this.SM_ACTION = SM_ACTION == null ? null : SM_ACTION.trim();
    }

    /**
     * @return the value of sys_menu.SM_ORDER
     */
    public Long getSM_ORDER() {
        return SM_ORDER;
    }

    /**
     * @param SM_ORDER the value for sys_menu.SM_ORDER
     */
    public void setSM_ORDER(Long SM_ORDER) {
        this.SM_ORDER = SM_ORDER;
    }

    /**
     * @return the value of sys_menu.SM_CONTENT
     */
    public String getSM_CONTENT() {
        return SM_CONTENT;
    }

    /**
     * @param SM_CONTENT the value for sys_menu.SM_CONTENT
     */
    public void setSM_CONTENT(String SM_CONTENT) {
        this.SM_CONTENT = SM_CONTENT == null ? null : SM_CONTENT.trim();
    }

    /**
     * @return the value of sys_menu.SM_ADMIN
     */
    public String getSM_ADMIN() {
        return SM_ADMIN;
    }

    /**
     * @param SM_ADMIN the value for sys_menu.SM_ADMIN
     */
    public void setSM_ADMIN(String SM_ADMIN) {
        this.SM_ADMIN = SM_ADMIN == null ? null : SM_ADMIN.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", SM_ID=").append(SM_ID);
        sb.append(", SAP_ID=").append(SAP_ID);
        sb.append(", SM_NAME=").append(SM_NAME);
        sb.append(", SM_PARENTID=").append(SM_PARENTID);
        sb.append(", SM_ICON=").append(SM_ICON);
        sb.append(", SM_TYPE=").append(SM_TYPE);
        sb.append(", SM_ACTION=").append(SM_ACTION);
        sb.append(", SM_ORDER=").append(SM_ORDER);
        sb.append(", SM_CONTENT=").append(SM_CONTENT);
        sb.append(", SM_ADMIN=").append(SM_ADMIN);
        sb.append("]");
        return sb.toString();
    }
}