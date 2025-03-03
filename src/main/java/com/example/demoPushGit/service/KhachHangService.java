package com.example.demoPushGit.service;

import com.example.demoPushGit.entity.KhachHang;

import java.util.ArrayList;
import java.util.List;

public class KhachHangService {
    List<KhachHang> khachHangs = new ArrayList<>();

    public void addKhachHang(KhachHang kh) {
        khachHangs.add(kh);
    }


    public KhachHang findByMaKH(String ma) {

        if (ma == null || ma.trim().isEmpty()) {
            throw new IllegalArgumentException("Không được để trống");
        }

        if (ma.length() < 2 || ma.length() > 10) {
            throw new IllegalArgumentException("Nhập ký tự trong khoảng 2 - 10");
        }

        for (KhachHang kh : khachHangs) {
            if (kh.getMaKH().equals(ma)) {
                return kh;
            }
        }

        throw new IllegalArgumentException("Không tìm thấy mã");
    }
}
