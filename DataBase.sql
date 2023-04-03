DROP DATABASE DuAn1_QuanLyThuVien

USE MASTER
CREATE DATABASE DuAn1_QuanLyThuVien

USE DuAn1_QuanLyThuVien

CREATE TABLE NhanVien(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
MaNV VARCHAR(10) NOT NULL,
TaiKhoan VARCHAR(Max) NOT NULL,
MatKhau VARCHAR(Max) NOT NULL,
HoTen NVARCHAR(50) NOT NULL,
NgaySinh DATE NOT NULL,
GioiTinh  NVARCHAR(50) NOT NULL,
DiaChi NVARCHAR(50) NOT NULL,
SDT NVARCHAR(50) NOT NULL,
TrangThai INT NOT NULL,
ChucVu NVARCHAR(50) NOT NULL,
Avatar NVARCHAR(50) NOT NULL
)

CREATE TABLE DocGia(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
MaDocGia VARCHAR(10) NOT NULL,
HoTen NVARCHAR(50) NOT NULL,
NgaySinh DATE NOT NULL,
GioiTinh  NVARCHAR(50) NOT NULL,
DiaChi NVARCHAR(50) NOT NULL,
SDT NVARCHAR(50) NOT NULL,
)


CREATE TABLE TheLoai(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
MaTheLoai VARCHAR(10) NOT NULL,
TenTheLoai NVARCHAR(50) NOT NULL,
)

CREATE TABLE NhaXuatBan(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
MaNhaXuatBan VARCHAR(10) NOT NULL,
TenNhaXuatBan NVARCHAR(50) NOT NULL,
DiaChi NVARCHAR(50) NOT NULL,
SDT NVARCHAR(50) NOT NULL,
EMAIL NVARCHAR(50) NOT NULL,
WEBSITE NVARCHAR(50) NOT NULL,
)

CREATE TABLE DauSach(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
TenSach NVARCHAR(50) NOT NULL,
MaSach VARCHAR(10) NOT NULL,
MaISBN NVARCHAR(50) NOT NULL,
TacGia  NVARCHAR(50) NOT NULL,
IDTheLoai UNIQUEIDENTIFIER NOT NULL,
IDNhaXuatBan UNIQUEIDENTIFIER NOT NULL,
NamXuatBan INT NOT NULL,
HinhAnh VARCHAR(200) NOT NULL,
Gia MONEY NOT NULL,
SoTrang INT NOT NULL,
FOREIGN KEY (IDTheLoai) REFERENCES TheLoai(ID),
FOREIGN KEY (IDNhaXuatBan) REFERENCES NhaXuatBan(ID),
)

CREATE TABLE QuyenSach(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
IdDauSach UNIQUEIDENTIFIER Not null,
MaQuyenSach VARCHAR(10) NOT NULL,
TinhTrangSach BIT NOT NULL,
DoHuHao float not null,
TrangThai INT NOT NULL,
FOREIGN KEY (IdDauSach) REFERENCES DauSach(ID),
)


CREATE TABLE PhieuYeuCauTTV(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
HoTen NVARCHAR(50) NOT NULL,
NgaySinh Date NOT NULL,
QueQuan NVARCHAR(50) NOT NULL,
GioiTinh  NVARCHAR(50) NOT NULL,
DiaChi NVARCHAR(50) NOT NULL,
SDT NVARCHAR(50) NOT NULL,
)

CREATE TABLE TheThuVien(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
IdDocGia UNIQUEIDENTIFIER NOT NULL,
MaTTV VARCHAR(10) NOT NULL,
NgayCap Date NOT NULL,
NgayHetHan Date,
GhiChu NVARCHAR(50) NOT NULL,
TrangThai INT NOT NULL,
FOREIGN KEY (IdDocGia) REFERENCES DocGia(ID),
)


CREATE TABLE PhieuMuon(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
IdTTV UNIQUEIDENTIFIER NOT NULL,
MaPhieuMuon VARCHAR(10) NOT NULL,
NgayMuon DATE NOT NULL,
NgayHenTra DATE NOT NULL,
GhiChu NVARCHAR(Max),
TienCoc MONEY,
FOREIGN KEY (IdTTV) REFERENCES TheThuVien(ID)
)

CREATE TABLE PhieuMuonChiTiet(
IdPhieuMuon UNIQUEIDENTIFIER NOT NULL,
IdQuyenSach UNIQUEIDENTIFIER NOT NULL,
MaPhieuMuon VARCHAR(10) NOT NULL,
MaSach VARCHAR(10) NOT NULL,
TenSach NVARCHAR(50) NOT NULL,
SoTrang INT NOT NULL,
TinhTrangSach NVARCHAR(50)NOT NULL,
DoHuHao float not null,
PRIMARY KEY(IdPhieuMuon,IdQuyenSach),
FOREIGN KEY (IdPhieuMuon) REFERENCES PhieuMuon(ID),
FOREIGN KEY (IdQuyenSach) REFERENCES QuyenSach(ID),
)


CREATE TABLE PhieuTra(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
IDPhieuMuon UNIQUEIDENTIFIER NOT NULL,
TenDocGia NVARCHAR(50) NOT NULL,
DiaChiDocGia NVARCHAR(50) NOT NULL,
NgayMuon DATE NOT NULL,
NgayHenTra DATE NOT NULL,
GhiChu NVARCHAR(Max),
TrangThai INT,
FOREIGN KEY (IdPhieuMuon) REFERENCES PhieuMuon(ID),
)

CREATE TABLE PhieuTraChiTiet(
IdPhieuTra UNIQUEIDENTIFIER NOT NULL,
IdQuyenSach UNIQUEIDENTIFIER NOT NULL,
MaSach VARCHAR(10) NOT NULL,TenSach NVARCHAR(50) NOT NULL,
SoTrang INT NOT NULL,
TinhTrangSach NVARCHAR(50)NOT NULL,
DoHuHao float not null,
PRIMARY KEY(IdPhieuTra,IdQuyenSach),
FOREIGN KEY (IdPhieuTra) REFERENCES PhieuTra(ID),
FOREIGN KEY (IdQuyenSach) REFERENCES QuyenSach(ID),
)


CREATE TABLE PhieuDen(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
MaPhieuDen VARCHAR(10) NOT NULL,
IDPhieuMuon UNIQUEIDENTIFIER NOT NULL,
IDNhanVien UNIQUEIDENTIFIER NOT NULL,
IDTTV UNIQUEIDENTIFIER NOT NULL,
SoTienPhat MONEY,
NgayTra DATE,
FOREIGN KEY (IDPhieuMuon) REFERENCES PhieuMuon(ID),
FOREIGN KEY (IDNhanVien) REFERENCES NhanVien(ID),
FOREIGN KEY (IDTTV) REFERENCES TheThuVien(ID)
)

CREATE TABLE PhieuDenChiTiet(
IdPhieuDen UNIQUEIDENTIFIER PRIMARY KEY NOT NULL,
MaSach VARCHAR(10) NOT NULL,
TenSach NVARCHAR(50) NOT NULL,
SoTrang INT NOT NULL,
TinhTrangSach NVARCHAR(50) NOT NULL,
DoHuHao float not null,
FOREIGN KEY (IdPhieuDen) REFERENCES PhieuDen(ID)
)

CREATE TABLE PhieuNopMuon(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
MaPhieuNopMuon VARCHAR(10) NOT NULL,
IDPhieuMuon UNIQUEIDENTIFIER NOT NULL,
IDNhanVien UNIQUEIDENTIFIER NOT NULL,
IDTTV UNIQUEIDENTIFIER NOT NULL,
SoTienPhat MONEY,
NgayTra DATE,
FOREIGN KEY (IDPhieuMuon) REFERENCES PhieuMuon(ID),
FOREIGN KEY (IDNhanVien) REFERENCES NhanVien(ID),
FOREIGN KEY (IDTTV) REFERENCES TheThuVien(ID)
)

CREATE TABLE PhieuNopMuonChiTiet(
IdPhieuNopMuon UNIQUEIDENTIFIER NOT NULL,
MaSach VARCHAR(10) NOT NULL,
TenSach NVARCHAR(50) NOT NULL,
SoTrang INT NOT NULL,
TinhTrangSach NVARCHAR(50) NOT NULL,
DoHuHao float not null,
FOREIGN KEY (IdPhieuNopMuon) REFERENCES PhieuNopMuon(ID)
)



INSERT INTO [dbo].[NhanVien]
           ([MaNV]
           ,[TaiKhoan]
           ,[MatKhau]
           ,[HoTen]
           ,[NgaySinh]
           ,[GioiTinh]
           ,[DiaChi]
           ,[SDT]
           ,[TrangThai]
           ,[ChucVu]
           ,[Avatar])
     VALUES
		
			('NV002',N'dat123',N'dat123',N'Bùi Quang Hoàn',N'2003-04-05',N'Nam',N'Hà Nội','0865893585',1,N'Thủ Thư',N'003'),
           ('NV001',N'nam123',N'nam123',N'Bế Phuong Nam',N'2003-03-04',N'Nam',N'Hà Nội','0865938564',1,N'Admin',N'003')

		   select * from NhanVien 
		   delete from NhanVien
  delete from DocGia

select * from DocGia 
insert into docgia(MaDocGia,HoTen,NgaySinh,GioiTinh,DiaChi,sdt)
values (N'DG001', N'Nám Phương Bê', N'2003-04-23', N'Nam', N'Địa Chỉ', N'0969770992')

select * from TheThuVien
insert into TheThuVien(IdDocGia, MaTTV, NgayCap, NgayHetHan, GhiChu, TrangThai)
values(N'D5D47FBC-E172-4BBE-8DD9-33518C50560A', N'TV001', N'2023-04-02', N'2023-05-02', N'Không Có Gì', 1)

select * from PhieuMuon
INSERT INTO PhieuMuon(IdTTV, MaPhieuMuon, NgayMuon,NgayHenTra,GhiChu, TienCoc) VALUES((SELECT ID FROM TheThuVien WHERE TheThuVien.MaTTV = N'TV001'), dbo.AUTO_MaPM(), N'2023-04-02', N'2023-04-10', N'Không Có Gì', 10000)

SELECT PM.MaPhieuMuon, TTV.MaTTV, TenDocGia = (SELECT HoTen FROM DocGia AS DG2 INNER JOIN TheThuVien AS TTV2 ON TTV2.IdDocGia = DG2.Id WHERE TTV2.Id = TTV.ID), DiaChi = (SELECT DiaChi FROM DocGia AS DG2 INNER JOIN TheThuVien AS TTV2 ON TTV2.IdDocGia = DG2.Id WHERE TTV2.Id = TTV.ID), PM.NgayMuon, PM.NgayHenTra, PM.GhiChu, PM.TienCoc  FROM PhieuMuon AS PM INNER JOIN TheThuVien AS TTV ON TTV.Id = PM.IdTTV



SELECT * FROM DauSach

INSERT INTO DauSach(TenSach, MaSach, MaISBN, TacGia, IDTheLoai, IDNhaXuatBan, NamXuatBan, HinhAnh, Gia, SoTrang)
VALUES(N'Con Chim', N'S001',N'0-8313-5522-0', N'Nguyễn Văn B', N'A48B0B93-DBCE-4FD3-9423-DBB89DC9C687', N'9F87C9AD-2D16-42D8-A755-284920D3FF14', 2023, N'a.jpg', 20000,200)


INSERT INTO DauSach(TenSach, MaSach, MaISBN, TacGia, IDTheLoai, IDNhaXuatBan, NamXuatBan, HinhAnh, Gia, SoTrang)
VALUES(N'Con Heo', N'S002',N'0-3769-1236-7', N'Nguyễn Văn B', N'A48B0B93-DBCE-4FD3-9423-DBB89DC9C687', N'9F87C9AD-2D16-42D8-A755-284920D3FF14', 2023, N'a.jpg', 20000,200)



INSERT INTO DauSach(TenSach, MaSach, MaISBN, TacGia, IDTheLoai, IDNhaXuatBan, NamXuatBan, HinhAnh, Gia, SoTrang)
VALUES(N'Con Gấu', N'S003',N'0-8656-6917-1', N'Nguyễn Văn B', N'A48B0B93-DBCE-4FD3-9423-DBB89DC9C687', N'9F87C9AD-2D16-42D8-A755-284920D3FF14', 2023, N'a.jpg', 20000,200)






SELECT * FROM TheLoai

INSERT INTO TheLoai(MaTheLoai, TenTheLoai)
VALUES (N'TL001', N'Truyện Cổ Tích')

SELECT * FROM NhaXuatBan

INSERT INTO NhaXuatBan(MaNhaXuatBan,TenNhaXuatBan, DiaChi, SDT, EMAIL,WEBSITE)
VALUES (N'XB001',N'Hoa Hồng', N'Việt Nam', N'0987654321', N'HoaHong@gmail.com.vn', N'HoaHongXB.com')

select * from PhieuMuon

select * from PhieuMuonChiTiet

delete from PhieuMuonChiTiet

insert into PhieuMuonChiTiet(IdPhieuMuon, IdQuyenSach, MaPhieuMuon, MaSach, TenSach, SoTrang, TinhTrangSach, DoHuHao)
values(
(select id from PhieuMuon where PhieuMuon.MaPhieuMuon = N'PM001'),
(select quyensach.Id from QuyenSach inner join DauSach on QuyenSach.IdDauSach = DauSach.Id where DauSach.MaISBN = N'0-3769-1236-7'), 
N'PM001' ,
(select MaSach from DauSach where DauSach.MaISBN = N'0-3769-1236-7') ,
(select TenSach from DauSach where DauSach.MaISBN = N'0-3769-1236-7'),  
(select SoTrang from DauSach where DauSach.MaISBN = N'0-3769-1236-7'), 
(select QuyenSach.TinhTrangSach from QuyenSach inner join DauSach on QuyenSach.IdDauSach = DauSach.Id where DauSach.MaISBN = N'0-3769-1236-7'),
(select QuyenSach.DoHuHao from QuyenSach inner join DauSach on QuyenSach.IdDauSach = DauSach.Id where DauSach.MaISBN = N'0-3769-1236-7'))


insert into PhieuMuonChiTiet(IdPhieuMuon, IdQuyenSach, MaPhieuMuon, MaSach, TenSach, SoTrang, TinhTrangSach, DoHuHao)
values(
(select id from PhieuMuon where PhieuMuon.MaPhieuMuon = N'PM001'),
(select quyensach.Id from QuyenSach inner join DauSach on QuyenSach.IdDauSach = DauSach.Id where DauSach.MaISBN = N'0-8313-5522-0'), 
N'PM001' ,
(select MaSach from DauSach where DauSach.MaISBN = N'0-8313-5522-0') ,
(select TenSach from DauSach where DauSach.MaISBN = N'0-8313-5522-0'),  
(select SoTrang from DauSach where DauSach.MaISBN = N'0-8313-5522-0'), 
(select QuyenSach.TinhTrangSach from QuyenSach inner join DauSach on QuyenSach.IdDauSach = DauSach.Id where DauSach.MaISBN = N'0-8313-5522-0'),
(select QuyenSach.DoHuHao from QuyenSach inner join DauSach on QuyenSach.IdDauSach = DauSach.Id where DauSach.MaISBN = N'0-8313-5522-0'))



insert into PhieuMuonChiTiet(IdPhieuMuon, IdQuyenSach, MaPhieuMuon, MaSach, TenSach, SoTrang, TinhTrangSach, DoHuHao)
values(
(select id from PhieuMuon where PhieuMuon.MaPhieuMuon = N'PM001'),
(select quyensach.Id from QuyenSach inner join DauSach on QuyenSach.IdDauSach = DauSach.Id where DauSach.MaISBN = N'0-8656-6917-1'), 
N'PM001' ,
(select MaSach from DauSach where DauSach.MaISBN = N'0-8656-6917-1') ,
(select TenSach from DauSach where DauSach.MaISBN = N'0-8656-6917-1'),  
(select SoTrang from DauSach where DauSach.MaISBN = N'0-8656-6917-1'), 
(select QuyenSach.TinhTrangSach from QuyenSach inner join DauSach on QuyenSach.IdDauSach = DauSach.Id where DauSach.MaISBN = N'0-8656-6917-1'),
(select QuyenSach.DoHuHao from QuyenSach inner join DauSach on QuyenSach.IdDauSach = DauSach.Id where DauSach.MaISBN = N'0-8656-6917-1'))






/*

insert into PhieuMuonChiTiet(IdPhieuMuon, IdQuyenSach, MaPhieuMuon, MaSach, TenSach, SoTrang, TinhTrangSach, DoHuHao) values(
(select id from PhieuMuon where PhieuMuon.MaPhieuMuon = N'PM001'),
(select quyensach.Id from QuyenSach inner join DauSach on QuyenSach.IdDauSach = DauSach.Id where DauSach.MaISBN = N'0-8656-6917-1'), 
N'PM001' ,
(select MaSach from DauSach where DauSach.MaISBN = N'0-8656-6917-1') ,
(select TenSach from DauSach where DauSach.MaISBN = N'0-8656-6917-1'),  
(select SoTrang from DauSach where DauSach.MaISBN = N'0-8656-6917-1'), 
(select QuyenSach.TinhTrangSach from QuyenSach inner join DauSach on QuyenSach.IdDauSach = DauSach.Id where DauSach.MaISBN = N'0-8656-6917-1'),
(select QuyenSach.DoHuHao from QuyenSach inner join DauSach on QuyenSach.IdDauSach = DauSach.Id where DauSach.MaISBN = N'0-8656-6917-1'))




*/










select * from QuyenSach
insert into QuyenSach(IdDauSach, MaQuyenSach, TinhTrangSach,DoHuHao,TrangThai)
values ((select id from DauSach where DauSach.MaISBN = N'0-8656-6917-1'), N'QS003', 'true', 100, 1)


SELECT PM.MaPhieuMuon, TTV.MaTTV, TenDocGia = 
(SELECT HoTen FROM DocGia AS DG2 INNER JOIN TheThuVien
AS TTV2 ON TTV2.IdDocGia = DG2.Id WHERE TTV2.Id = TTV.ID),
DiaChi = (SELECT DiaChi FROM DocGia AS DG2 INNER JOIN 
TheThuVien AS TTV2 ON TTV2.IdDocGia = DG2.Id WHERE TTV2.Id
= TTV.ID), PM.NgayMuon, PM.NgayHenTra, PM.GhiChu, PM.TienCoc
FROM PhieuMuon AS PM INNER JOIN TheThuVien AS TTV ON TTV.Id
= PM.IdTTV inner join PhieuMuonChiTiet as pmct on pmct.IdPhieuMuon = PM.Id 
where pmct.IdQuyenSach = (select Id from QuyenSach where QuyenSach.IdDauSach 
= (select id from DauSach where dausach.MaISBN = '0-8313-5522-0'))



SELECT * FROM PhieuMuonChiTiet

SELECT PM.MaPhieuMuon, QS.MaQuyenSach, PMCT.TenSach,PMCT.SoTrang,PMCT.TinhTrangSach, PMCT.DoHuHao FROM PhieuMuonChiTiet AS PMCT INNER JOIN PhieuMuon AS PM ON PM.ID = PMCT.IdPhieuMuon 
INNER  JOIN QuyenSach AS QS ON PMCT.IdQuyenSach = QS.Id WHERE PM.MaPhieuMuon = N'PM001'




select * from PhieuMuon


INSERT INTO PhieuMuon()




CREATE FUNCTION AUTO_MaDS()
	RETURNS VARCHAR(5)
	AS 
	BEGIN
		DECLARE @MA VARCHAR(5)
		IF (SELECT COUNT(DauSach.MaSach) FROM DauSach) = 0
			SET @MA = '0'
		ELSE
			SELECT @MA = MAX(RIGHT(DauSach.MaSach,3)) FROM DauSach
			SELECT @MA = CASE
				WHEN @MA >= 0 AND @MA < 9 THEN 'S00' + CONVERT(CHAR, CONVERT(INT,@MA) + 1)
				WHEN @MA >= 0 AND @MA < 99 THEN 'S0' + CONVERT(CHAR,CONVERT(INT, @MA) + 1)
				WHEN @MA >= 99 THEN 'S' + CONVERT(CHAR,CONVERT(INT, @MA) + 1)
			END
		RETURN @MA
	END


	delete from PhieuMuonChiTiet 


select * from DauSach where  MaISBN = '0-2651-4316-0'


select * from DauSach order by MaSach desc

INSERT INTO DauSach(TenSach, MaSach, MaISBN, TacGia, IDTheLoai, IDNhaXuatBan, NamXuatBan, HinhAnh, Gia, SoTrang)
VALUES(N'Con Ngựa', dbo.AUTO_MaDS(),N'0-3150-8943-1', N'Nguyễn Văn B', N'A48B0B93-DBCE-4FD3-9423-DBB89DC9C687', N'9F87C9AD-2D16-42D8-A755-284920D3FF14', 2023, N'a.jpg', 20000,200)


select * from QuyenSach order by MaQuyenSach desc


insert into QuyenSach(IdDauSach, MaQuyenSach, TinhTrangSach,DoHuHao,TrangThai)
values ((select id from DauSach where DauSach.MaISBN = N'0-3150-8943-1'), dbo.AUTO_MaQS(), 'true', 100, 1)
