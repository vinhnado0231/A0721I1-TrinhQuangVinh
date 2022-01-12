-- Yeu cau 2:
select nhan_vien.* from nhan_vien
where (ho_ten like 'H%' or ho_ten like 'K%' or ho_ten like 'T%')and length(ho_ten)<=15;

-- Yeu cau 3:
select khach_hang.* from khach_hang
where (year(curdate())-year(ngay_sinh) between 18 and 50) 
and (dia_chi like "%Quang Tri" or dia_chi like "%Da Nang"); 

-- Yeu cau 4:
select khach_hang.ma_khach_hang,khach_hang.ho_ten, count(hop_dong.ma_khach_hang) as so_lan_dat_phong from khach_hang
inner join hop_dong on khach_hang.ma_khach_hang=hop_dong.ma_khach_hang
where ma_loai_khach in (select ma_loai_khach from loai_khach where ten_loai_khach="Diamond")
group by hop_dong.ma_khach_hang
order by so_lan_dat_phong asc;
    
-- Yeu cau 5:
select khach_hang.ma_khach_hang, ho_ten, ten_loai_khach,hop_dong.ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc,
sum(dich_vu.chi_phi_thue+hop_dong_chi_tiet.so_luong*dich_vu_di_kem.gia) as tong_tien
from khach_hang left join hop_dong on khach_hang.ma_khach_hang=hop_dong.ma_khach_hang
left join loai_khach on loai_khach.ma_loai_khach=khach_hang.ma_loai_khach
left join dich_vu on hop_dong.ma_dich_vu=dich_vu.ma_dich_vu
left join hop_dong_chi_tiet on hop_dong.ma_hop_dong=hop_dong_chi_tiet.ma_hop_dong
left join dich_vu_di_kem on dich_vu_di_kem.ma_dich_vu_di_kem=hop_dong_chi_tiet.ma_dich_vu_di_kem
group by hop_dong.ma_hop_dong,hop_dong.ma_dich_vu;

    
-- Yeu cau 6:
select dich_vu.ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu from dich_vu 
inner join loai_dich_vu on dich_vu.ma_loai_dich_vu=loai_dich_vu.ma_loai_dich_vu
where dich_vu.ma_dich_vu not in (select ma_dich_vu from hop_dong where (month(ngay_lam_hop_dong)between 1 and 3)
and year(ngay_lam_hop_dong));
  
-- Yeu cau 7:
select ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue, ten_loai_dich_vu
from dich_vu 
inner join loai_dich_vu on dich_vu.ma_loai_dich_vu=loai_dich_vu.ma_loai_dich_vu
where dich_vu.ma_dich_vu in (select ma_dich_vu from hop_dong where year(ngay_lam_hop_dong)=2020) and
dich_vu.ma_dich_vu not in (select ma_dich_vu from hop_dong where year(ngay_lam_hop_dong)=2021);
  
-- Yeu cau 8:
-- c1:
select ho_ten from khach_hang
union
select ho_ten from khach_hang;
  
-- c2:
select ho_ten from khach_hang
group by ho_ten;

-- yeu cau 9:
select month(ngay_lam_hop_dong) as thang,count(hop_dong.ma_dich_vu) as so_luong_khach_hang from dich_vu
inner join hop_dong on hop_dong.ma_dich_vu=dich_vu.ma_dich_vu
where year(ngay_lam_hop_dong)=2021
group by thang
order by month(ngay_lam_hop_dong);

-- yeu cau 10:
select hop_dong.ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, sum(so_luong) as so_luong_dich_vu_di_kem 
from hop_dong 
left join hop_dong_chi_tiet on hop_dong.ma_hop_dong=hop_dong_chi_tiet.ma_hop_dong
left join dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem=dich_vu_di_kem.ma_dich_vu_di_kem
group by hop_dong.ma_hop_dong; 
 
-- Yeu cau 11:
select dich_vu_di_kem.* from dich_vu_di_kem
inner join hop_dong_chi_tiet on dich_vu_di_kem.ma_dich_vu_di_kem=hop_dong_chi_tiet.ma_dich_vu_di_kem
inner join hop_dong on hop_dong.ma_hop_dong=hop_dong_chi_tiet.ma_hop_dong
inner join khach_hang on khach_hang.ma_khach_hang=hop_dong.ma_khach_hang
inner join loai_khach on loai_khach.ma_loai_khach=khach_hang.ma_loai_khach
where ten_loai_khach="Diamond" and dia_chi like "%Vinh" or  dia_chi like "%Quang Ngai";
 