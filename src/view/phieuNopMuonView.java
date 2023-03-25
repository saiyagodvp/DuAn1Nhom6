package view;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.PhieuNopMuon;
import service.phieuNopMuonService;

public class phieuNopMuonView extends javax.swing.JFrame {

    phieuNopMuonService pnmService;
    String maPhieuNopMuon;
    String idNVClick;
    String idTTVClick;

    public phieuNopMuonView() {
        initComponents();
        this.setLocationRelativeTo(null);

        this.pnmService = new phieuNopMuonService();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        this.txtNgayPhat.setText(dtf.format(now));
        loadTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPNM = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIDTheThuVien = new javax.swing.JTextField();
        txtIDNhanVien = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtLyDoNopSachMuon = new javax.swing.JTextArea();
        txtNgayPhat = new javax.swing.JTextField();
        txtSoTienPhat = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnClearForm = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblPNM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Phiếu Nộp Muộn", "Mã Nhân Viên", "Mã Thẻ Thành Viên", "Tên Người Nộp Muộn", "Lý Do Nộp Muộn", "Số Tiền Phạt(VNĐ)", "Ngày Phạt"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPNM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPNMMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPNM);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("ID Nhân Viên:");

        jLabel2.setText("ID Thẻ Thư Viện:");

        jLabel3.setText("Lý Do Nộp Sách Muộn: ");

        jLabel4.setText("Số Tiền Phạt:");

        jLabel5.setText("Ngày Phạt:");

        txtIDNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDNhanVienActionPerformed(evt);
            }
        });

        txtLyDoNopSachMuon.setColumns(20);
        txtLyDoNopSachMuon.setRows(5);
        jScrollPane2.setViewportView(txtLyDoNopSachMuon);

        txtNgayPhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayPhatActionPerformed(evt);
            }
        });

        txtSoTienPhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoTienPhatActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnClearForm.setText("Clear Form");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");

        btnTimKiem.setText("Tìm Kiếm");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClearForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnSua)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnClearForm, btnSua, btnThem, btnTimKiem, btnXoa});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClearForm)
                    .addComponent(btnThem)
                    .addComponent(btnSua))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa)
                    .addComponent(btnTimKiem))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(63, 63, 63)
                        .addComponent(txtIDTheThuVien))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(76, 76, 76)
                        .addComponent(txtIDNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgayPhat, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoTienPhat, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(txtIDNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoTienPhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txtIDTheThuVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayPhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Phiếu Thu Nộp Sách Muộn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDNhanVienActionPerformed

    private void txtNgayPhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayPhatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayPhatActionPerformed

    private void txtSoTienPhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoTienPhatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoTienPhatActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        PhieuNopMuon pnm = getFormData();

        if (pnm != null) {
            System.out.println(pnm.getIdNhanVien() + " " + pnm.getIdTheThuVien() + " " + pnm.getLyDoNopMuon() + " " + pnm.getSoTienPhat() + " " + pnm.getNgayPhat());
            int chon = JOptionPane.showConfirmDialog(this, "Bạn có muốn thêm không?");
            if (chon == JOptionPane.YES_OPTION) {
                pnmService.insertPhieuNopMuon(pnm);
                loadTable();
                JOptionPane.showMessageDialog(this, "Thêm thành công!");
            }
        } else {
            JOptionPane.showMessageDialog(this, " lThêmỗi vì form null công!");
            return;
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        PhieuNopMuon pnm = getFormData();
        if (pnm != null) {
            System.out.println(pnm.getIdNhanVien() + " " + pnm.getIdTheThuVien() + " " + pnm.getLyDoNopMuon() + " " + pnm.getSoTienPhat() + " " + pnm.getNgayPhat());
            int chon = JOptionPane.showConfirmDialog(this, "Bạn có muốn sửa không?");
            if (chon == JOptionPane.YES_OPTION) {

                pnmService.updatePhieuNopMuon(pnm, maPhieuNopMuon);
                loadTable();
                JOptionPane.showMessageDialog(this, "Sửa thành công!");
                return;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Sửa lỗi vì form null công!");
            return;
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void tblPNMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPNMMouseClicked
        int row = this.tblPNM.getSelectedRow();
        maPhieuNopMuon = this.tblPNM.getValueAt(row, 0).toString();
        String lyDo = this.tblPNM.getValueAt(row, 4).toString();
        String soTienPhat = this.tblPNM.getValueAt(row, 5).toString();
        String ngayPhat = this.tblPNM.getValueAt(row, 6).toString();
        maPhieuNopMuon = this.tblPNM.getValueAt(row, 0).toString();
        System.out.println(maPhieuNopMuon);
        PhieuNopMuon pnm = pnmService.getOnePhieuNopMuon(maPhieuNopMuon);
        System.out.println(pnm.getIdNhanVien() + "\n" + pnm.getIdTheThuVien());
        idNVClick = pnm.getIdNhanVien();
        idTTVClick = pnm.getIdTheThuVien();
        txtIDNhanVien.setText(idNVClick);
        txtIDTheThuVien.setText(idTTVClick);
        txtLyDoNopSachMuon.setText(lyDo);
        txtSoTienPhat.setText(soTienPhat);
        txtNgayPhat.setText(ngayPhat);
    }//GEN-LAST:event_tblPNMMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new phieuNopMuonView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearForm;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblPNM;
    private javax.swing.JTextField txtIDNhanVien;
    private javax.swing.JTextField txtIDTheThuVien;
    private javax.swing.JTextArea txtLyDoNopSachMuon;
    private javax.swing.JTextField txtNgayPhat;
    private javax.swing.JTextField txtSoTienPhat;
    // End of variables declaration//GEN-END:variables

    private void loadTable() {
        DefaultTableModel model = (DefaultTableModel) this.tblPNM.getModel();
        model.setRowCount(0);
        for (PhieuNopMuon pnm : pnmService.getAllListPhieuNopMuon()) {
            Object rowData[] = {
                pnm.getMaPhieuNopMuon(),
                pnm.getMaNhanVien(),
                pnm.getMaTTV(),
                pnm.getTenNguoiNopMuon(),
                pnm.getLyDoNopMuon(),
                pnm.getSoTienPhat(),
                pnm.getNgayPhat()
            };
            model.addRow(rowData);
        }
    }

    public PhieuNopMuon getFormData() {
        String idNV = this.txtIDNhanVien.getText().trim().toString();
        String idTTV = this.txtIDTheThuVien.getText().trim().toString();
        String lyDo = this.txtLyDoNopSachMuon.getText().trim().toString();
        String tienStr = this.txtSoTienPhat.getText().trim().toString();
        String ngay = this.txtNgayPhat.getText().trim().toString();

        double tien = -1;

        if (idNV.length() == 0) {
            JOptionPane.showMessageDialog(this, "Nhập idNV Đi");
            return null;
        }

        if (idTTV.length() == 0) {
            JOptionPane.showMessageDialog(this, "Nhập idTTV Đi");
            return null;
        }
        if (lyDo.length() == 0) {
            JOptionPane.showMessageDialog(this, "Nhập lyDo Đi");
            return null;
        }

        if (tienStr.length() == 0) {
            JOptionPane.showMessageDialog(this, "Nhập tien Đi");
            return null;
        }

        if (ngay.length() == 0) {
            JOptionPane.showMessageDialog(this, "Nhập ngay Đi");
            return null;
        }

        try {
            tien = Double.parseDouble(tienStr);
            if (tien < 0) {
                JOptionPane.showMessageDialog(this, "Tien phải là số dương!");
                return null;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Tien phải là số!");
            return null;
        }

        PhieuNopMuon pnm = new PhieuNopMuon(idNV, idTTV, lyDo, tien, ngay);

        return pnm;
    }

}
