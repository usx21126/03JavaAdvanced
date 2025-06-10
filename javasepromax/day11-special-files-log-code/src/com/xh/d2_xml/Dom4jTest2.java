package com.xh.d2_xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.ArrayList;
import java.util.List;

public class Dom4jTest2 {
    public static void main(String[] args) throws DocumentException {
        //1.创建SAX解析对象
        SAXReader saxReader = new SAXReader();
        //2.把xml读成Document文档对象
        Document document = saxReader.read("day11-special-files-log-code\\src\\com\\xh\\d2_xml\\Concat.xml");
        //3.读取Document对象的根元素
        Element rootElement = document.getRootElement();

        ArrayList<Contact> contacts = new ArrayList<>();
        List<Element> elements = rootElement.elements();
        for (Element element : elements) {
            Contact contact = new Contact();
            contact.setId(Integer.valueOf(element.attributeValue("id")));
            contact.setName(element.elementText("name"));
            contact.setEmail(element.elementText("email"));
            contact.setGender(element.elementText("gender").charAt(0));
            contacts.add(contact);
        }
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
