package chap17_generic.clazz;

public class NoticeBoard {
	private int nBoardNo;
	private String nBoardTitle;
	private String nBoardContent;
	
	public int getnBoardNo() {
		return nBoardNo;
	}
	public void setnBoardNo(int nBoardNo) {
		this.nBoardNo = nBoardNo;
	}
	public String getnBoardTitle() {
		return nBoardTitle;
	}
	public void setnBoardTitle(String nBoardTitle) {
		this.nBoardTitle = nBoardTitle;
	}
	public String getnBoardContent() {
		return nBoardContent;
	}
	public void setnBoardContent(String nBoardContent) {
		this.nBoardContent = nBoardContent;
	}
	@Override
	public String toString() {
		return "NoticeBoard [nBoardNo=" + nBoardNo + ", nBoardTitle=" + nBoardTitle + ", nBoardContent=" + nBoardContent
				+ "]";
	}
}
