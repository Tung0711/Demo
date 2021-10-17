/*
Class NhanVien : Super Class.
 */
package Demo;

public abstract class NhanVien {
    //attributes
    private String MaNV,TenNV;
    private int namSinh,sdt,soNC;
    //constructor ko tham so
    public NhanVien(){
        
    }
    //constructor co tham so
    public NhanVien(String MaNV,String TenNV,int namSinh,int sdt,int soNC){
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.namSinh = namSinh;
        this.sdt = sdt;
        this.soNC = soNC;
    }
    
    //set get
    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaNV() {
        return MaNV;
    }
    
    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getTenNV() {
        return TenNV;
    }
    
    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public int getNamSinh() {
        return namSinh;
    }
    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSoNC(int soNC) {
        this.soNC = soNC;
    }

    public int getSoNC() {
        return soNC;
    }
    
    //phuong thuc truu tuong tinh luong
    public abstract double TinhLuong();
    // in thong tin
    public String toString(){
        String str = " \n NhanVien";
        return str;
}
}
