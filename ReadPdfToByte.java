import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

public class ReadPdfToByte {

	public void pdfReader() throws IOException {
		InputStream fis = null;
		int i = 0;
		try {
			fis = new FileInputStream("C:\\Users\\srk19\\OneDrive\\Desktop\\Sumanth_onbase_resume.docx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			XWPFDocument document = new XWPFDocument(fis);

			List<XWPFParagraph> paragraphs = document.getParagraphs();
			System.out.println("Total no:of paragraphs" + paragraphs.size());
			for (XWPFParagraph para : paragraphs) {
				System.out.println(para.getText());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			fis.close();
		}

	}

	public static void main(String[] args) throws IOException {
		ReadPdfToByte rpt = new ReadPdfToByte();
		rpt.pdfReader();
	}
}
