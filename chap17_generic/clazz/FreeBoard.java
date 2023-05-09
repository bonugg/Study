package chap17_generic.clazz;

public class FreeBoard {
	private int fBoardNo;
	private String fBoardTitle;
	private String fBoardContent;
	
	public int getfBoardNo() {
		return fBoardNo;
	}
	public void setfBoardNo(int fBoardNo) {
		this.fBoardNo = fBoardNo;
	}
	public String getfBoardTitle() {
		return fBoardTitle;
	}
	public void setfBoardTitle(String fBoardTitle) {
		this.fBoardTitle = fBoardTitle;
	}
	public String getfBoardContent() {
		return fBoardContent;
	}
	public void setfBoardContent(String fBoardContent) {
		this.fBoardContent = fBoardContent;
	}
	
	@Override
	public String toString() {
		return "FreeBoard [fBoardNo=" + fBoardNo + ", fBoardTitle=" + fBoardTitle + ", fBoardContent=" + fBoardContent
				+ "]";
	}
}
