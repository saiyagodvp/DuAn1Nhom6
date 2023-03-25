package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.PhieuNopMuon;

public class phieuNopMuonRepository {

    public ArrayList<PhieuNopMuon> getAllListPhieuNopMuon() {
        ArrayList<PhieuNopMuon> listPNM = new ArrayList<>();
        try {
            Connection conn = JdbcUtil.getConnection();

            String query = "select PNM.MaPhieuNopMuon, NV.MaNV, TTV.MaTTV,TenNguoiNopMuon = (Select HoTen From DocGia As DG INNER JOIN TheThuVien AS TTV2 ON TTV2.IdDocGia = DG.Id WHERE TTV2.ID = TTV.ID), PNM.LyDoNopMuon, PNM.SoTienPhat, PNM.NgayPhat from PhieuNopMuon As PNM INNER JOIN NhanVien AS NV ON PNM.IDNhanVien = NV.Id INNER JOIN TheThuVien AS TTV ON TTV.ID = PNM.IDTTV ";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next() == true) {
                PhieuNopMuon pnm = new PhieuNopMuon();
                pnm.setMaPhieuNopMuon(rs.getString("MaPhieuNopMuon"));
                pnm.setMaNhanVien(rs.getString("MaNV"));
                pnm.setMaTTV(rs.getString("MaTTV"));
                pnm.setTenNguoiNopMuon(rs.getString("TenNguoiNopMuon"));
                pnm.setLyDoNopMuon(rs.getString("LyDoNopMuon"));
                pnm.setSoTienPhat(rs.getDouble("SoTienPhat"));
                pnm.setNgayPhat(rs.getString("NgayPhat"));
                listPNM.add(pnm);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listPNM;
    }
    
    public PhieuNopMuon getOnePhieuNopMuon(String ma) {
        PhieuNopMuon pnm = new PhieuNopMuon();
        try {
            Connection conn = JdbcUtil.getConnection();

            String query = "select PNM.IDNhanVien, PNM.IDTTV,PNM.MaPhieuNopMuon, NV.MaNV, TTV.MaTTV,TenNguoiNopMuon = (Select HoTen From DocGia As DG INNER JOIN TheThuVien AS TTV2 ON TTV2.IdDocGia = DG.Id WHERE TTV2.ID = TTV.ID), PNM.LyDoNopMuon, PNM.SoTienPhat, PNM.NgayPhat from PhieuNopMuon As PNM INNER JOIN NhanVien AS NV ON PNM.IDNhanVien = NV.Id INNER JOIN TheThuVien AS TTV ON TTV.ID = PNM.IDTTV where PNM.MaPhieuNopMuon = ?";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, ma);
            System.out.println("da set ma: " + ma);
            ps.execute();
          
            ResultSet rs = ps.getResultSet();
            
            while (rs.next() == true) {
                pnm.setMaPhieuNopMuon(rs.getString("MaPhieuNopMuon"));
                pnm.setMaNhanVien(rs.getString("MaNV"));
                pnm.setMaTTV(rs.getString("MaTTV"));
                pnm.setTenNguoiNopMuon(rs.getString("TenNguoiNopMuon"));
                pnm.setLyDoNopMuon(rs.getString("LyDoNopMuon"));
                pnm.setSoTienPhat(rs.getDouble("SoTienPhat"));
                pnm.setNgayPhat(rs.getString("NgayPhat"));
                pnm.setIdNhanVien(rs.getString("IDNhanVien"));
                pnm.setIdTheThuVien(rs.getString("IDTTV"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pnm;
    }

    public void insertPhieuNopMuon(PhieuNopMuon pnm) {
        try {
            Connection conn = JdbcUtil.getConnection();

            String query = "Insert Into PhieuNopMuon(MaPhieuNopMuon,IDNhanVien,"
                    + "IDTTV,LyDoNopMuon,SoTienPhat,NgayPhat) Values"
                    + "(dbo.AUTO_MaPhieuNopMuon(),?,?,?,?,?)";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, pnm.getIdNhanVien());
            ps.setString(2, pnm.getIdTheThuVien());
            ps.setString(3, pnm.getLyDoNopMuon());
            ps.setDouble(4, pnm.getSoTienPhat());
            ps.setString(5, pnm.getNgayPhat());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updatePhieuNopMuon(PhieuNopMuon pnm, String ma) {
        try {
            Connection conn = JdbcUtil.getConnection();

            String query = " UPDATE PhieuNopMuon SET IDNhanVien = ?, IDTTV = ?, "
                    + "LyDoNopMuon = ?, SoTienPhat = ?, NgayPhat = ? where MaPhieuNopMuon = ?";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, pnm.getIdNhanVien());
            ps.setString(2, pnm.getIdTheThuVien());
            ps.setString(3, pnm.getLyDoNopMuon());
            ps.setDouble(4, pnm.getSoTienPhat());
            ps.setString(5, pnm.getNgayPhat());
            ps.setString(6, ma);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
