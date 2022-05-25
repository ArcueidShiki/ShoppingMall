package cn.tedu.shoppingmallv1.entity;

import java.util.Date;

public class Order {
    private Integer id;  // 订单id
    private Integer uid; //用户id
    private Integer pid; //商品id
    private Integer did; // 配送信息id
    private Integer butCount; //单件商品数量
    private Integer status; // 订单状态，后序补充详细解释
    private Date created; //创建日期
    private Date ended; // 交易结束日期

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", uid=" + uid +
                ", pid=" + pid +
                ", did=" + did +
                ", butCount=" + butCount +
                ", status=" + status +
                ", created=" + created +
                ", ended=" + ended +
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

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getButCount() {
        return butCount;
    }

    public void setButCount(Integer butCount) {
        this.butCount = butCount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getEnded() {
        return ended;
    }

    public void setEnded(Date ended) {
        this.ended = ended;
    }
}
