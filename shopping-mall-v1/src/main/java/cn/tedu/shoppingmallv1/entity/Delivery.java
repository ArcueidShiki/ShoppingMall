package cn.tedu.shoppingmallv1.entity;
//配送信息
public class Delivery {
    private Integer id; //配送信息id
    private Integer uid; //用户id
    private String receiver; //收货人
    private String tel; //收货人电话
    private String address; // 收货人地址

    @Override
    public String toString() {
        return "Delivery{" +
                "id=" + id +
                ", uid=" + uid +
                ", receiver='" + receiver + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
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

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
