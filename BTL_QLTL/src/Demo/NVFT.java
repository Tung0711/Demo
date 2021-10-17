/*
 Class NVFT: Nhân Viên Toàn Thời Gian
 */
package Demo;

public class NVFT extends NhanVien{
    //attributes
    private float luongCB,luongLT,phuCap;
    private int ngayLT;
    //constructor ko tham so
    public NVFT(){
        
    }
    //constructor co tham so
    public NVFT (String MaNV,String TenNV,int namSinh,int sdt,int soNC,float luongCB,float LuongLT,float phuCap,int ngayLT){
        super (MaNV,TenNV,namSinh,sdt,soNC);
        this.luongCB = luongCB;
        this.luongLT = LuongLT;
        this.ngayLT = ngayLT;
        this.phuCap = phuCap;
    }
    
    //set get
    public void setLuongCB(float luongCB) {
        this.luongCB = luongCB;
    }

    public float getLuongCB() {
        return luongCB;
    }

    public void setNgayLT(int ngayLT) {
        this.ngayLT = ngayLT;
    }

    public int getNgayLT() {
        return ngayLT;
    }

    public void setLuongLT(float luongLT) {
        this.luongLT = luongLT;
    }

    public float getLuongLT() {
        return luongLT;
    }

    public void setPhuCap(float phuCap) {
        this.phuCap = phuCap;
    }

    public float getPhuCap() {
        return phuCap;
    }
    
    @Override
    public double TinhLuong() {
        return ((this.getSoNC()*this.luongCB)+(this.ngayLT*this.luongLT)+this.phuCap);
    }
     // toString
    @Override
    public String toString(){
    String str = "NHÂN VIÊN FULL TIME: \n"
        + "+ Ma nhan vien: "+this.getMaNV()+"\n"
        + "+ Ten nhan vien: "+this.getTenNV()+"\n"
        + "+ Nam sinh: "+this.getNamSinh()+"\n "
        + "+ SDT:"+this.getSdt()+"\n "
        + "+ So Ngay Cong:"+this.getSoNC()+"\n "
        + "+ Luong: "+this.TinhLuong();
    return str;
    }
}
