package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Unit test for ChemicalElement class.
 */
public class ChemicalElementTest {

    @Test
    public void atomicNumber_shouldReturnAtomicNumber() {
        //When
        int number = ChemicalElement.Fe.atomicNumber();
        //Then
        assertThat(number, is(26));
    }
    
    @Test
    public void atomicNumber_shouldReturnFirstAtomicNumber() {
        //When
        int number = ChemicalElement.H.atomicNumber();
        //Then
        assertThat(number, is(1));
    }

    @Test
    public void symbol_shouldReturnSymbol() {
        //When
        String symbol = ChemicalElement.Fe.symbol();
        //Then
        assertThat(symbol, is(equalTo("Fe")));
    }
    
    @Test
    public void elementName_shouldReturnElementName() {
        //When
        String name = ChemicalElement.Fe.elementName();
        //Then
        assertThat(name, is(equalTo("Iron")));
    }
    
    @Test
    public void valueOf_shouldReturnElement() {
        //When
        ChemicalElement element = ChemicalElement.valueOf("Fe");
        //Then
        assertThat(element, is(ChemicalElement.Fe));
    }
}
