package yr.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import yr.example.mapper.EmpMapper;
import yr.example.poji.Emp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class Demo1ApplicationTests {
    @Autowired
    EmpMapper e;

    @Test
    public void TestDelete() {
        e.delete(16);
    }

    @Test
    public void TestInsert() {
        Emp es = new Emp(99, "123456", "123465", "周树人", (short) 0, "123", (short) 1, LocalDate.of(2023, 10, 1), 1, LocalDateTime.now(), LocalDateTime.now());
        e.insert(es);
    }

    @Test
    public void TestUpdate() {
        Emp es = new Emp(21, "1234567891", "123465", "周树人", (short) 0, "123", (short) 1, LocalDate.of(2023, 10, 1), 1, LocalDateTime.now(), LocalDateTime.now());
        e.update(es);
    }

    @Test
    public void TestSearch() {
        Emp t = new Emp();
        t = e.showInfo(1);
        System.out.println(t);
    }

    @Test
    public void TestSearch2() {
        List<Emp> ls;
        ls = e.search("金庸", (short) 1, LocalDate.of(2000, 1, 1), LocalDate.of(2030, 1, 1));
        System.out.println(ls);
    }

    @Test
    public void TestSearch3() {
        List<Emp> ls;
        ls = e.search("周", null, null, null);
        System.out.println(ls);
    }

    @Test
    public void TestUpdate2() {
        Emp es = new Emp();
        es.setId(1);
        es.setName("张三");
        es.setPassword("11111111111111111");
        e.update(es);
    }
    @Test
    public void TestDelete2()
    {
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        e.deleteByIds(lst);
    }
}
