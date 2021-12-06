create database ChuyenDoiERDSangMoHinhQuanHe;

use ChuyenDoiERDSangMoHinhQuanHe;

create table PHIEUXUAT(
SoPX int primary key auto_increment,
NgayXuat date
);

create table VATTU(
MaVTU int primary key auto_increment,
TenVTU varchar(100)
);

create table PHIEUNHAP(
SoPN int primary key auto_increment,
NgayNhap date
);

create table NHACC(
MaNCC int primary key auto_increment,
TenNCC varchar(100),
DiaChi varchar(100),
SDT varchar(10)
);

create table SDT(
MaSDT int primary key auto_increment,
SDT varchar(10),
MaNCC int,
foreign key(MaNCC) references NHACC(MaNCC)
);

create table DonDH(
SoDH int primary key auto_increment,
NgayDH date,
MaNCC int,
foreign key(MaNCC) references NHACC(MaNCC)
);

create table PHIEUXUAT_VATTU(
DGXuat int,
SLXuat int,
SoPX int,
MaVTU int,
primary key(SoPX,MaVTU),
foreign key(SoPX) references PHIEUXUAT(SoPX),
foreign key(MaVTU) references VATTU(MaVTU)
);

create table VATTU_PHIEUNHAP(
DGNhap int,
SLNhap int,
MaVTU int,
SoPN int,
primary key(MaVTU,SoPN),
foreign key(MaVTU) references VATTU(MaVTU),
foreign key(SoPN) references PHIEUNHAP(SoPN)
);

create table VATTU_DONHANG(
MaVTU int,
SoDH int,
primary key(MaVTU,SoDH),
foreign key(MaVTU) references VATTU(MaVTU),
foreign key(SoDH) references DonDH(SoDH)
);
