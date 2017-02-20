/**
 * Copyright (C) Kuzumeji Studios. All rights reserved.
 * Licensed under the GNU AFFERO GENERAL PUBLIC LICENSE, Version 3 (the 'License').
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at https://www.gnu.org/licenses/agpl-3.0.txt
 */
package com.github.kuzumeji;
import static org.junit.Assert.*;
import org.junit.Test;
/**
 * {@link Library}のテスト
 * @author nilcy
 */
public class LibraryTest {
    /** テスト */
    @SuppressWarnings("static-method")
    @Test
    public void testSomeLibraryMethod() {
        final Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
}
