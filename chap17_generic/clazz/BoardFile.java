package chap17_generic.clazz;

public class BoardFile<T> {
	//T == FreeBoard는 boardNo == fBoardNo
	//T == NoticeBoard는 boardNo == nBoardNo
	private int boardNo;
	private int type;
	private String fileNm;
	private T t;
	
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getFileNm() {
		return fileNm;
	}
	public void setFileNm(String fileNm) {
		this.fileNm = fileNm;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	@Override
	public String toString() {
		return "BoardFile [boardNo=" + boardNo + ", type=" + type + ", fileNm=" + fileNm + ", t=" + t + "]";
	}
}
