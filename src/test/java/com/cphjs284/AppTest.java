package com.cphjs284;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

public class AppTest {

    MinMax mmObj;
    String[] args;

    @Before
    public void RunBeforeEachTest(){
        mmObj = new MinMax();
        args = new String[]{};
    }

    @Test
    public void ZeroArgsGivenShouldReturnEmptyArr(){
        //Arrange
        int[] expected = new int[]{};
        //Act
        int[] actual = mmObj.FindMinMax(args);
        //Assert
        assertEquals(expected.length, actual.length);
    }

    @Test
    public void OneArgGivenShouldReturnEmptyArr(){
        //Arrange
        int[] expected = new int[]{};
        args = new String[]{"4"};
        //Act
        int[] actual = mmObj.FindMinMax(args);
        //Assert
        assertEquals(expected.length, actual.length);
        assertArrayEquals(expected, actual);
    }

    @Test()
    public void OneInvalidArgGivenShouldReturnEmptyArr(){
        //Arrange
        int[] expected = new int[]{};
        args = new String[]{"U"};
        //Act
        int[] actual = mmObj.FindMinMax(args);
        //Assert
        assertEquals(expected.length, actual.length);
        assertArrayEquals(expected, actual);
        
    }

    @Test(expected = NumberFormatException.class)
    public void TwoInvalidArgsGivenShouldThrowException(){
       
        //Arrange
        args = new String[]{"U", "I am an invalid arg - hi ho!"};
        //Act
        int[] actual = mmObj.FindMinMax(args);

        //use assert or assume here?
    }

    @Test
    public void TwoEqualNumbersShouldReturnArr(){
        //Arrange
        int[] expected = new int[]{4,4};
        args = new String[]{"4","4"};
        //Act
        int[] actual = mmObj.FindMinMax(args);
        //Assert
        assertEquals(expected.length, actual.length);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void TwoDiffNumbersSmallLargeShouldReturnArr(){
        //Arrange
        int[] expected = new int[]{4,9};
        args = new String[]{"4","9"};
        //Act
        int[] actual = mmObj.FindMinMax(args);
        //Assert
        assertEquals(expected.length, actual.length);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void TwoDiffNumbersLargeSmallShouldReturnArr(){
        //Arrange
        int[] expected = new int[]{9,14};
        args = new String[]{"14","9"};
        //Act
        int[] actual = mmObj.FindMinMax(args);
        //Assert
        assertEquals(expected.length, actual.length);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void ManyDiffNumbersShouldReturnArr(){
        //Arrange
        int[] expected = new int[]{1,456};
        args = new String[]{"14","9","1","456","78","9","45","90"};
        //Act
        int[] actual = mmObj.FindMinMax(args);
        //Assert
        assertEquals(expected.length, actual.length);
        assertArrayEquals(expected, actual);
    }



}
