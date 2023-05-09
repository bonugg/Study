package chap17_generic;

import chap17_generic.clazz.BoardFile;
import chap17_generic.clazz.FreeBoard;
import chap17_generic.clazz.NoticeBoard;

public class _01_useOfGenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자유게시판 게시글에 대한 첨부파일
		BoardFile<FreeBoard> fBoardFile = 
				new BoardFile<FreeBoard>();
		
		//아래 방식으로도 선언할 수 있고
		fBoardFile.setT(new FreeBoard());
		fBoardFile.getT()
				.setfBoardNo(1);
		fBoardFile.getT()
				.setfBoardTitle("test");
		fBoardFile.getT()
				.setfBoardContent("test입니다.");
		
		fBoardFile.setBoardNo(
			fBoardFile.getT().getfBoardNo()
		);
		
		fBoardFile.setType(
			fBoardFile.getT()
					  .getClass()
					  .getSimpleName()
					  .equals("FreeBoard")
					  ? 1 : 2
		);
//		FreeBoard fBoard = new FreeBoard();
//		fBoard.setfBoardNo(1);
//		fBoard.setfBoardTitle("test");
//		fBoard.setfBoardContent("test입니다.");
//		fBoardFile.setT(fBoard);
		
		//공지사항 게시글에 대한 첨부파일
		BoardFile<NoticeBoard> nBoardFile =
				new BoardFile<NoticeBoard>();
		
		nBoardFile.setT(new NoticeBoard());
		nBoardFile.getT()
			.setnBoardNo(2);
		nBoardFile.getT()
			.setnBoardTitle("test");
		nBoardFile.getT()
			.setnBoardContent("test입니다.");
		
		nBoardFile.setBoardNo(
			nBoardFile.getT().getnBoardNo()
		);
		
		nBoardFile.setType(
			nBoardFile.getT()
					  .getClass()
					  .getSimpleName()
					  .equals("FreeBoard")
					  ? 1 : 2
		);
		
		
		
		
		
	}

}
