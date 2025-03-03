package com.example.demoPushGit.service;

import com.example.demoPushGit.entity.KhachHang;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KhachHangServiceTest {


    private KhachHangService khachHangService;

    @BeforeEach
    void setUp() {

        khachHangService = new KhachHangService();

        khachHangService.addKhachHang(new KhachHang("maKH001", "a", 18, "aa@gmail.com", "098487475"));
        khachHangService.addKhachHang(new KhachHang("maKH002", "b", 16, "ba@gmail.com", "098487475"));
        khachHangService.addKhachHang(new KhachHang("maKH003", "c", 17, "va@gmail.com", "098487475"));
        khachHangService.addKhachHang(new KhachHang("maKH004", "d", 19, "da@gmail.com", "098487475"));
    }

    @Test
    void findByMaKHHopLe() {
        KhachHang khachHang = khachHangService.findByMaKH("maKH001");
        System.out.println(khachHang.toString());
        assertEquals("maKH001", khachHang.getMaKH());
    }

    @Test
    void findByMaKH1KyTu() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> khachHangService.findByMaKH("m"));
        assertEquals("Nhập ký tự trong khoảng 2 - 10", exception.getMessage());
    }


    @Test
    void findByMaKHNhieuKyTu() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> khachHangService.findByMaKH("maKh0129321"));
        assertEquals("Nhập ký tự trong khoảng 2 - 10", exception.getMessage());
    }

    @Test
    void findByMaKHKhongTonTai() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> khachHangService.findByMaKH("maKh99999"));
        assertEquals("Không tìm thấy mã", exception.getMessage());
    }

 @Test
    void findByMaKHTrong() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> khachHangService.findByMaKH(""));
        assertEquals("Không được để trống", exception.getMessage());
    }


}