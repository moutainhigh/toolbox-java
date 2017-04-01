package com.jason798.common;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class ReflectHelperTest {


    @Test
    public void testTryConvertToBoxClass() throws Exception {

    }

    @Test
    public void testCheckClassExist() throws Exception {

    }

    @Test
    public void testGetInstance() throws Exception {

    }

    @Test
    public void testChkAssigned() throws Exception {
        //interface
        Class clz = List.class;
        Class aclz = ArrayList.class;
        boolean a = ReflectHelper.chkAInheritB(aclz,clz);
        assertEquals(true,a);
        //abstract class
        Class abclz = AbstractList.class;
        boolean b = ReflectHelper.chkAInheritB(aclz,abclz);
        assertEquals(true,b);
        //class
        Class ca = Vector.class;
        Class cb = Stack.class;
        boolean c = ReflectHelper.chkAInheritB(cb,ca);
        assertEquals(true,c);
        //error
        ca = Vector.class;
        cb = Stack.class;
        c = ReflectHelper.chkAInheritB(ca,cb);
        assertEquals(false,c);

    }

    @Test
    public void testChkImplementIntfForObjIntf() throws Exception {

    }

    @Test
    public void testChkImpiIntfForObjIntfs() throws Exception {

    }

    @Test
    public void testChkImpiIntfForClzIntfs() throws Exception {

    }

    @Test
    public void testGetFieldSet() throws Exception {

    }

    @Test
    public void testGetFieldsHaveSetter() throws Exception {

    }

    @Test
    public void testGetAllFieldsHaveSetter() throws Exception {

    }

    @Test
    public void testGetFieldType() throws Exception {

    }

    @Test
    public void testGetFieldTypeAll() throws Exception {

    }

    @Test
    public void testGetterForce() throws Exception {

    }

    @Test
    public void testGetter() throws Exception {

    }

    @Test
    public void testGetGetterMethod() throws Exception {

    }

    @Test
    public void testGetterInner() throws Exception {

    }

    @Test
    public void testSetterForObjFieldValTypeVal() throws Exception {

    }

    @Test
    public void testSetterForObjFieldVal() throws Exception {

    }

    @Test
    public void testSetterForce() throws Exception {

    }

    @Test
    public void testSetBean() throws Exception {

    }

    @Test
    public void testCopyFieldForSourceTargetIgnoresAllowNull() throws Exception {

    }

    @Test
    public void testCopyFieldForSourceTarget() throws Exception {

    }

    @Test
    public void testGetSelfAndParentClassListBean() throws Exception {

    }

    @Test
    public void testGetSelfAndParentClassListClz() throws Exception {

    }

    @Test
    public void testGetClassListForClzOpt() throws Exception {

    }

    @Test
    public void testGetClassListForBeanOpt() throws Exception {

    }

    @Test
    public void testGetFieldValueMapForObjAllowNullValueParentOptIgnoresSpecifies() throws Exception {

    }

    @Test
    public void testGetFieldValueMapIncludeNull() throws Exception {

    }

    @Test
    public void testGetFieldValueMapAllIncludeNull() throws Exception {

    }

    @Test
    public void testGetFieldValueMapForBeanAllowNullValue() throws Exception {

    }

    @Test
    public void testGetFieldValueMapAll() throws Exception {

    }

    @Test
    public void testGetFieldValueMapIncludeNullSpec() throws Exception {

    }

    @Test
    public void testGetFieldMapForBeanAllowNullValueOptIgnoresSpecifies() throws Exception {

    }

    @Test
    public void testGetFieldMapBean() throws Exception {

    }

    @Test
    public void testGetFieldMapAll() throws Exception {

    }

    @Test
    public void testGetFieldMapForBeanAllowNullValue() throws Exception {

    }

    @Test
    public void testGetDeclaredMethod() throws Exception {

    }

    @Test
    public void testGetDeclaredField() throws Exception {

    }

    @Test
    public void testConvert() throws Exception {

    }

    @Test
    public void testInvokeMethod() throws Exception {

    }


    @Test
    public void testCheckGetMethod() throws Exception { 
                /* 
                try { 
                   Method method = ReflectHelper.getClass().getMethod("checkGetMethod", Method[].class, String.class); 
                   method.setAccessible(true); 
                   method.invoke(<Object>, <Parameters>); 
                } catch(NoSuchMethodException e) { 
                } catch(IllegalAccessException e) { 
                } catch(InvocationTargetException e) { 
                } 
                */
    }

    @Test
    public void testIsBoolean() throws Exception { 
                /* 
                try { 
                   Method method = ReflectHelper.getClass().getMethod("isBoolean", Field.class); 
                   method.setAccessible(true); 
                   method.invoke(<Object>, <Parameters>); 
                } catch(NoSuchMethodException e) { 
                } catch(IllegalAccessException e) { 
                } catch(InvocationTargetException e) { 
                } 
                */
    }

    @Test
    public void testGenerateGetName() throws Exception { 
                /* 
                try { 
                   Method method = ReflectHelper.getClass().getMethod("generateGetName", String.class, boolean.class); 
                   method.setAccessible(true); 
                   method.invoke(<Object>, <Parameters>); 
                } catch(NoSuchMethodException e) { 
                } catch(IllegalAccessException e) { 
                } catch(InvocationTargetException e) { 
                } 
                */
    }

    @Test
    public void testIsEmpty() throws Exception { 
                /* 
                try { 
                   Method method = ReflectHelper.getClass().getMethod("isEmpty", Object.class); 
                   method.setAccessible(true); 
                   method.invoke(<Object>, <Parameters>); 
                } catch(NoSuchMethodException e) { 
                } catch(IllegalAccessException e) { 
                } catch(InvocationTargetException e) { 
                } 
                */
    }

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
} 