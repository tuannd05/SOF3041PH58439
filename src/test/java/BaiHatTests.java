import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class BaiHatTests {

    private BaiHatService baiHatService;

    @BeforeAll
    static void setupAll() {
        System.out.println("Thực thi một lần duy nhất");
    }

    @BeforeEach
    void setUp() {
        baiHatService = new BaiHatService();
        System.out.println("Thực thi trước mỗi lần");
    }

    @Test
    void test1_BienDuoiHopLe() {
        BaiHat bh  = new BaiHat("BH01", "bai hat a", "ca si a", 120.0f, "pop");
        baiHatService.addBaiHat(bh);
        assertEquals(1, baiHatService.getList().size());
    }

    @Test
    void test2_BienDuoiKhongHopLe() {
        BaiHat bh = new BaiHat("BH02", "bai hat B", "ca si B", 119.9f, "pop");
        assertThrows(IllegalArgumentException.class, ()
                -> baiHatService.addBaiHat(bh));
    }

    @Test
    void test3_BienTrenHopLe() {
        BaiHat bh = new BaiHat("BH03", "bai hat C", "ca si C", 359.0f, "rock");
        assertDoesNotThrow(() -> baiHatService.addBaiHat(bh));
    }

    @Test
    void Test4_BienTrenKhongHopLe() {
        BaiHat bh = new BaiHat("BH04", "bai hat D", "ca si D", 360.0f, "Jazz");
        assertThrows(IllegalArgumentException.class, ()
                -> baiHatService.addBaiHat(bh));
    }

    @Test
    void test5_VungHopLe() {
        BaiHat bh = new BaiHat("BH05", "Song E", "Singer E", 240.0f, "Ballad");
        assertDoesNotThrow(() -> baiHatService.addBaiHat(bh));
        assertEquals(1, baiHatService.getList().size());
    }

    @Test
    void test6_TruongTrong() {
        BaiHat bh = new BaiHat ("  ", "Song F", "Singer F", 200.0f, "Pop");
        assertThrows(IllegalArgumentException.class, ()
                -> baiHatService.addBaiHat(bh));
    }

    @AfterEach
    void tearDown() {
        baiHatService = null;
        System.out.println("Thực thi sau mỗi lần");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Thực thi một lần duy nhất sau khi hoàn thành");
    }
}