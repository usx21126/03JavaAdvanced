package com.xh.d2_xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class Dom4jTest1 {
    public static void main(String[] args) throws DocumentException {
        //1.创建SAX解析对象
        SAXReader saxReader = new SAXReader();
        //2.把xml读成Document文档对象
        Document document = saxReader.read("day11-special-files-log-code\\src\\com\\xh\\d2_xml\\Concat.xml");
        //3.读取Document对象的根元素
        Element rootElement = document.getRootElement();
        System.out.println(rootElement.getName());

        //4.提取子元素
        List<Element> sonElements = rootElement.elements("contact");
        for(Element sonElement : sonElements){
            System.out.println(sonElement.getName());
        }
        //5.指定单个子元素
        Element contactElement = rootElement.element("contact");
        System.out.println(contactElement.attributeValue("id"));
        Element userElement = rootElement.element("user");
        System.out.println(userElement.attributeValue("id"));

        //6.元素文本
        System.out.println(contactElement.elementText("name"));
        System.out.println(contactElement.elementText("gender"));
        System.out.println(contactElement.getText());
    }
}
