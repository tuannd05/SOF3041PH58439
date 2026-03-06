import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class DTBTest {

    private DTBService dTBService;

    @BeforeAll
    static void setupAll() {
        System.out.println("Thực thi một lần duy nhất");
    }

    @BeforeEach
    void setUp() {
        dTBService = new DTBService();
        System.out.println("Thực thi trước mỗi lần");
    }

    @Test
    void test1_BienXuatSacHopLe() {
        assertEquals("Xuất sắc", dTBService.xepLoai(9.0));
    }

    @Test
    void test2_VungXuatSacHopLe() {
        assertEquals("Xuất sắc", dTBService.xepLoai(9.5));
    }

    @Test
    void test3_BienGioiHopLe() {
        assertEquals("Giỏi", dTBService.xepLoai(7.0));
    }

    @Test
    void test4_BienDuoiGioiHopLe() {
        assertEquals("Giỏi", dTBService.xepLoai(8.99));
    }

    @Test
    void test5_BienTrungBinhHopLe() {
        assertEquals("Trung bình", dTBService.xepLoai(5.0));
    }

    @Test
    void test6_BienTrenTrungBinh() {
        assertEquals("Trung bình", dTBService.xepLoai(6.99));
    }

    @Test
    void test7_BienTruocYeu() {
        assertEquals("Yếu", dTBService.xepLoai(4.99));
    }

    @Test
    void test8_DiemYeuHopLe() {
        assertEquals("Yếu", dTBService.xepLoai(3.0));
    }

    @AfterEach
    void tearDown() {
        dTBService = null;
        System.out.println("Thực thi sau mỗi lần");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Thực thi một lần duy nhất sau khi hoàn thành");
    }
}