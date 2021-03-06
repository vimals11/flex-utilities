/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.adobe.ac.pmd.rules.maintanability;

import com.adobe.ac.pmd.rules.core.AbstractAstFlexRuleTest;
import com.adobe.ac.pmd.rules.core.AbstractFlexRule;
import com.adobe.ac.pmd.rules.core.ViolationPosition;

public class TrueFalseConditionRuleTest extends AbstractAstFlexRuleTest
{
   @Override
   protected ExpectedViolation[] getExpectedViolatingFiles()
   {
      return new ExpectedViolation[]
      { new ExpectedViolation( "PngEncoder.as", new ViolationPosition[]
       { new ViolationPosition( 557 ),
                   new ViolationPosition( 559 ),
                   new ViolationPosition( 561 ),
                   new ViolationPosition( 567 ) } ),//3rdVialoation
                  new ExpectedViolation( "Looping.as", new ViolationPosition[]
                  { new ViolationPosition( 32 ),
                              new ViolationPosition( 45 ),
                              new ViolationPosition( 54 ),
                              new ViolationPosition( 57 ) } ),
                  new ExpectedViolation( "RadonDataGrid.as", new ViolationPosition[]
                  { new ViolationPosition( 51 ),
                              new ViolationPosition( 182 ) } ),
                  new ExpectedViolation( "bug.FlexPMD181.as", new ViolationPosition[]
                  { new ViolationPosition( 2210 ) } ),
                  new ExpectedViolation( "AbstractRowData.as", new ViolationPosition[]
                  { new ViolationPosition( 94 ),
                              new ViolationPosition( 101 ) } ),
                  new ExpectedViolation( "com.adobe.ac.AbstractRowData.as", new ViolationPosition[]
                  { new ViolationPosition( 47 ) } ) };
   }

   @Override
   protected AbstractFlexRule getRule()
   {
      return new TrueFalseConditionRule();
   }
}
