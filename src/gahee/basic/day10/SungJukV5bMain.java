package gahee.basic.day10;

import gahee.basic.SungJuk.SungJukService;
import gahee.basic.SungJuk.SungJukServiceImpl;
import gahee.basic.SungJuk.SungJukVO;

public class SungJukV5bMain {
    public static void main(String[] args) {
       // SungJukService sjsrv = new SungJukServiceImpl();
       SungJukService sjsrv = SungJukServiceImpl.getInstance();

        SungJukVO sj = sjsrv.readSungJuk();
        sjsrv.computeSungJuk(sj);
        sjsrv.printSungJuk(sj);

    }
}
