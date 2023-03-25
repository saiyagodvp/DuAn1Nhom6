package service;

import java.util.ArrayList;
import model.PhieuNopMuon;
import repository.phieuNopMuonRepository;

public class phieuNopMuonService {

    private phieuNopMuonRepository pnmRepo;

    public phieuNopMuonService() {
        pnmRepo = new phieuNopMuonRepository();
    }

    public ArrayList<PhieuNopMuon> getAllListPhieuNopMuon() {
        return pnmRepo.getAllListPhieuNopMuon();
    }
    public PhieuNopMuon getOnePhieuNopMuon(String ma) {
        return pnmRepo.getOnePhieuNopMuon(ma);
    }

    public void insertPhieuNopMuon(PhieuNopMuon pnm) {
        pnmRepo.insertPhieuNopMuon(pnm);
    }
    public void updatePhieuNopMuon(PhieuNopMuon pnm, String ma) {
        pnmRepo.updatePhieuNopMuon(pnm, ma);
    }
}
