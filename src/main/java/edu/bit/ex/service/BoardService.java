package edu.bit.ex.service;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import edu.bit.ex.vo.BoardVO;

@Service
public class BoardService {

	@Inject
	SqlSession sqlSession;
	
	public List<BoardVO> selectBoardList() throws Exception {

		return sqlSession.selectList("board.selectBoardList");// sqlSession안에있는 selectList 사용
		// xml페이지 네임스페이스="board" 안에 selectBoardList를 집어넣는것
	}

	public BoardVO selectBoardOne(String userno)throws Exception {
		
		
		return sqlSession.selectOne("board.selectBoardOne",userno);
	}

	public void insertBoard(BoardVO boardVO) {
		
		sqlSession.insert("board.insertBoard",boardVO);
		
	}

	public void deleteBoard(BoardVO boardVO) {
		
			sqlSession.delete("board.deleteBoard", boardVO);
		
	}

	public void modifyBoard(BoardVO boardVO) {

		sqlSession.update("board.modifyBoard",boardVO);
		
	}
	public void replyBoard(BoardVO boardVO) {
		sqlSession.insert("board.replyBoard",boardVO);
	}
	public void replyUPBoard(BoardVO boardVO) {
		sqlSession.update("board.replyUPBoard",boardVO);
	}

	

	
	
}
