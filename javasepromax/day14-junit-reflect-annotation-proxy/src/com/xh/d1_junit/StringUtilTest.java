package com.xh.d1_junit;


import org.junit.*;

/**
 * 测试类
 */
public class StringUtilTest {
    @Before //修饰实例方法，每个测试方法前都执行一次
    public void before() {
        System.out.println("=================before==================");
    }
    @After
    public void after() {
        System.out.println("===============after==================");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("===============beforeClass===============");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("===============afterClass===============");
    }
    @Test
    public void testPrintNumber(){
        StringUtil.printNumber(null);
        StringUtil.printNumber("123");
        StringUtil.printNumber("");
    }
    @Test
    public void testGetMaxIndex(){
        System.out.println(StringUtil.getMaxIndex(null));
        System.out.println(StringUtil.getMaxIndex("123"));
        System.out.println(StringUtil.getMaxIndex(""));

        int i1 = StringUtil.getMaxIndex(null);
        int i2 = StringUtil.getMaxIndex("123");
        int i3 = StringUtil.getMaxIndex("");

        Assert.assertEquals("测试失败",-1,i1);
        Assert.assertEquals("测试失败",2,i2);
        Assert.assertEquals("测试失败",-1,i3);
        System.out.println("测试成功");
    }
}
