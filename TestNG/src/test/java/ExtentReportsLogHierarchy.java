import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsLogHierarchy 
{

	public static void main(String[] args) throws IOException 
	{
		ExtentReports extentReports=new ExtentReports();
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter("C:\\Users\\tusha\\Documents\\learning\\java full course\\TestNG\\reports2\\reportlog.html");
		extentReports.attachReporter(sparkReporter);
		
		//bold italic
		extentReports.createTest("text based test")
		.log(Status.FAIL,"information- normal")
		.log(Status.INFO,"<b> information-bold </b>")
		.log(Status.INFO,"<i> information-italic </i>")
		.log(Status.INFO,"<b><i> information-bold and italic <b><i>");
		
		// xml and json related representation
		String jsonData="{\"menu\": {\r\n"
				+ "  \"id\": \"file\",\r\n"
				+ "  \"value\": \"File\",\r\n"
				+ "  \"popup\": {\r\n"
				+ "    \"menuitem\": [\r\n"
				+ "      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\r\n"
				+ "      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\r\n"
				+ "      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\r\n"
				+ "    ]\r\n"
				+ "  }\r\n"
				+ "}}";
		
		String xmlData="<menu id=\"file\" value=\"File\">\r\n"
				+ "  <popup>\r\n"
				+ "    <menuitem value=\"New\" onclick=\"CreateNewDoc()\" />\r\n"
				+ "    <menuitem value=\"Open\" onclick=\"OpenDoc()\" />\r\n"
				+ "    <menuitem value=\"Close\" onclick=\"CloseDoc()\" />\r\n"
				+ "  </popup>\r\n"
				+ "</menu>";
		
		extentReports.createTest("xml test")
		.log(Status.INFO,MarkupHelper.createCodeBlock(xmlData,CodeLanguage.XML));
		
		extentReports.createTest("json test")
		.log(Status.INFO,MarkupHelper.createCodeBlock(jsonData, CodeLanguage.JSON));
		
		// represent collection related data
		List list=new ArrayList<>();
		list.add("monday");
		list.add("tuesday");
		list.add("wensday");
		list.add("thursday");
		list.add("friday");
		
		Map map=new HashMap();
		map.put("john","Cena");
		map.put("solomon","grundy");
		map.put("arthur","curry");
		map.put("no","name");
		
		Set set=map.keySet();
		
		extentReports.createTest("collection list data")
		.log(Status.SKIP,MarkupHelper.createOrderedList(list))
		.log(Status.SKIP,MarkupHelper.createUnorderedList(list));
		
		extentReports.createTest("collection set data")
		.log(Status.SKIP,MarkupHelper.createOrderedList(set))
		.log(Status.SKIP,MarkupHelper.createUnorderedList(set));
		
		extentReports.createTest("collection map data")
		.log(Status.SKIP,MarkupHelper.createOrderedList(map))
		.log(Status.SKIP,MarkupHelper.createUnorderedList(map));
		
		//highlight a message
		
		extentReports.createTest("highlight text 1")
		.log(Status.WARNING,MarkupHelper.createLabel("non highlighted text",ExtentColor.RED))
		.log(Status.WARNING,MarkupHelper.createLabel("highlighted colour",ExtentColor.GREEN));
		
		extentReports.createTest("highlight text 2")
		.log(Status.WARNING,MarkupHelper.createLabel("non highlighted text",ExtentColor.AMBER))
		.log(Status.WARNING,MarkupHelper.createLabel("highlighted colour",ExtentColor.INDIGO));
		
		
		
		try
		{
			int a=10/0;
		}catch(Exception e)
		{
			extentReports.createTest("exception test 1")
			.log(Status.PASS, e);
		}
		
		Throwable t=new RuntimeException("exception test 2");
		extentReports.createTest("exception test 2")
		.log(Status.PASS, t);
		
		
		
		
		extentReports.flush();
		Desktop.getDesktop().browse(new File("C:\\\\Users\\\\tusha\\\\Documents\\\\learning\\\\java full course\\\\TestNG\\\\reports2\\\\reportlog.html").toURI());
	
	}

}
