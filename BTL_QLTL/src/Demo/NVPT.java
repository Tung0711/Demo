/*
 Class NVPT: Nhân Viên Bán Thời Gian
 */
package Demo;

public class NVPT extends NhanVien {
    //atributes
    private float donGia;
    // constructor ko tham so
    public NVPT (){
        
    }
    //constructor co tham so
    public NVPT(String MaNV,String TenNV,int namSinh,int sdt,int soNC,float donGia){
        super(MaNV,TenNV,namSinh,sdt,soNC);
        this.donGia = donGia;
    }

    //set get

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public float getDonGia() {
        return donGia;
    }
    
    @Override
    public double TinhLuong() {
        return this.getSoNC()*this.donGia;  
    }
    
    // toString
    @Override
    public String toString(){
    String str = "NHÂN VIÊN PAST TIME: \n"
        + "+ Ma nhan vien: "+this.getMaNV()+"\n"
        + "+ Ten nhan vien: "+this.getTenNV()+"\n"
        + "+ Nam sinh: "+this.getNamSinh()+"\n "
        + "+ SDT:"+this.getSdt()+"\n "
        + "+ So Ngay Cong:"+this.getSoNC()+"\n "
        + "+ Luong: "+this.TinhLuong();
    return str;
    }
}
