package gahee.basic.SungJuk;

import java.util.List;

public interface SungJukV4DAO {

    int insertSungJuk(SungJukVO sj);
    List<SungJukVO> selectSungJuk();  // SungJukService2Impl의 list처럼 사용
    SungJukVO selectOneSungJuk(int sjno); //SungJukService4Impl의 showOneSungJuk pos를 넘겨옴
    int updateSungJuk(SungJukVO sj);
    int deleteSungJuk(int sjno);
    
}
