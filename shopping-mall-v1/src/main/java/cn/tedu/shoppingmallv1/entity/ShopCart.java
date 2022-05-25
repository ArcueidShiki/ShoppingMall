package cn.tedu.shoppingmallv1.entity;

public class ShopCart {
    private Integer id;
    private Integer uid; // 用户id
    private Integer pid;
    private Integer buyCount; // 单件商品的数量

    @Override
    public String toString() {
        return "ShopCart{" +
                "id=" + id +
                ", uid=" + uid +
                ", pid=" + pid +
                ", buyCount=" + buyCount +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
    }
}
