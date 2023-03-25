package model;

public class PhieuNopMuon {

    String id;
    String maPhieuNopMuon;
    String idNhanVien;
    String idTheThuVien;
    String lyDoNopMuon;
    Double soTienPhat;
    String ngayPhat;
    String maNhanVien;
    String maTTV;
    String tenNguoiNopMuon;

    public PhieuNopMuon() {
    }

 

    public PhieuNopMuon(String idNhanVien, String idTheThuVien, String lyDoNopMuon, Double soTienPhat, String ngayPhat) {
        this.idNhanVien = idNhanVien;
        this.idTheThuVien = idTheThuVien;
        this.lyDoNopMuon = lyDoNopMuon;
        this.soTienPhat = soTienPhat;
        this.ngayPhat = ngayPhat;
    }

    public PhieuNopMuon(String id, String maPhieuNopMuon, String idNhanVien, String idTheThuVien, String lyDoNopMuon, Double soTienPhat, String ngayPhat, String maNhanVien, String maTTV, String tenNguoiNopMuon) {
        this.id = id;
        this.maPhieuNopMuon = maPhieuNopMuon;
        this.idNhanVien = idNhanVien;
        this.idTheThuVien = idTheThuVien;
        this.lyDoNopMuon = lyDoNopMuon;
        this.soTienPhat = soTienPhat;
        this.ngayPhat = ngayPhat;
        this.maNhanVien = maNhanVien;
        this.maTTV = maTTV;
        this.tenNguoiNopMuon = tenNguoiNopMuon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaPhieuNopMuon() {
        return maPhieuNopMuon;
    }

    public void setMaPhieuNopMuon(String maPhieuNopMuon) {
        this.maPhieuNopMuon = maPhieuNopMuon;
    }

    public String getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getIdTheThuVien() {
        return idTheThuVien;
    }

    public void setIdTheThuVien(String idTheThuVien) {
        this.idTheThuVien = idTheThuVien;
    }

    public String getLyDoNopMuon() {
        return lyDoNopMuon;
    }

    public void setLyDoNopMuon(String lyDoNopMuon) {
        this.lyDoNopMuon = lyDoNopMuon;
    }

    public Double getSoTienPhat() {
        return soTienPhat;
    }

    public void setSoTienPhat(Double soTienPhat) {
        this.soTienPhat = soTienPhat;
    }

    public String getNgayPhat() {
        return ngayPhat;
    }

    public void setNgayPhat(String ngayPhat) {
        this.ngayPhat = ngayPhat;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getMaTTV() {
        return maTTV;
    }

    public void setMaTTV(String maTTV) {
        this.maTTV = maTTV;
    }

    public String getTenNguoiNopMuon() {
        return tenNguoiNopMuon;
    }

    public void setTenNguoiNopMuon(String tenNguoiNopMuon) {
        this.tenNguoiNopMuon = tenNguoiNopMuon;
    }

    
}
