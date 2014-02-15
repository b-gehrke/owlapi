/*
 * This file is part of the OWL API.
 *
 * The contents of this file are subject to the LGPL License, Version 3.0.
 *
 * Copyright (C) 2014, The University of Manchester
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0
 * in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 *
 * Copyright 2014, The University of Manchester
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.coode.owlapi.owlxmlparser;

import org.semanticweb.owlapi.io.OWLParserException;
import org.semanticweb.owlapi.model.UnloadableImportException;

/** @author Matthew Horridge, The University Of Manchester, Bio-Health Informatics
 *         Group
 * @since 2.0.0
 * @param <O>
 *            handled type */
public interface OWLElementHandler<O> {
    /** @param name
     *            element name
     * @throws OWLXMLParserException
     *             if an error is raised */
    void startElement(String name) throws OWLXMLParserException;

    /** @param localName
     *            local attribute name
     * @param value
     *            attribute value
     * @throws OWLParserException
     *             if an error is raised */
    void attribute(String localName, String value) throws OWLParserException;

    /** @throws OWLParserException
     *             if an error is raised
     * @throws UnloadableImportException
     *             if an import cannot be resolved */
    void endElement() throws OWLParserException, UnloadableImportException;

    /** @return object
     * @throws OWLXMLParserException
     *             if an error is raised */
    O getOWLObject() throws OWLXMLParserException;

    /** @param handler
     *            element handler
     * @throws OWLXMLParserException
     *             if an error is raised */
    void setParentHandler(OWLElementHandler<?> handler)
            throws OWLXMLParserException;

    /** @param handler
     *            element handler
     * @throws OWLXMLParserException
     *             if an error is raised */
    void handleChild(AbstractOWLAxiomElementHandler handler)
            throws OWLXMLParserException;

    /** @param handler
     *            element handler
     * @throws OWLXMLParserException
     *             if an error is raised */
    void handleChild(AbstractClassExpressionElementHandler handler)
            throws OWLXMLParserException;

    /** @param handler
     *            element handler
     * @throws OWLXMLParserException
     *             if an error is raised */
    void handleChild(AbstractOWLObjectPropertyElementHandler handler)
            throws OWLXMLParserException;

    /** @param handler
     *            element handler
     * @throws OWLXMLParserException
     *             if an error is raised */
    void handleChild(OWLDataPropertyElementHandler handler)
            throws OWLXMLParserException;

    /** @param handler
     *            element handler
     * @throws OWLXMLParserException
     *             if an error is raised */
    void handleChild(OWLIndividualElementHandler handler)
            throws OWLXMLParserException;

    /** @param handler
     *            element handler
     * @throws OWLXMLParserException
     *             if an error is raised */
    void handleChild(AbstractOWLDataRangeHandler handler)
            throws OWLXMLParserException;

    /** @param handler
     *            element handler
     * @throws OWLXMLParserException
     *             if an error is raised */
    void handleChild(OWLLiteralElementHandler handler)
            throws OWLXMLParserException;

    /** @param handler
     *            element handler
     * @throws OWLXMLParserException
     *             if an error is raised */
    void handleChild(OWLAnnotationElementHandler handler)
            throws OWLXMLParserException;

    /** @param handler
     *            element handler
     * @throws OWLXMLParserException
     *             if an error is raised */
    void handleChild(OWLAnonymousIndividualElementHandler handler)
            throws OWLXMLParserException;

    /** @param handler
     *            element handler
     * @throws OWLXMLParserException
     *             if an error is raised */
    void handleChild(OWLSubObjectPropertyChainElementHandler handler)
            throws OWLXMLParserException;

    /** @param handler
     *            element handler
     * @throws OWLXMLParserException
     *             if an error is raised */
    void handleChild(OWLDatatypeFacetRestrictionElementHandler handler)
            throws OWLXMLParserException;

    /** @param handler
     *            element handler
     * @throws OWLXMLParserException
     *             if an error is raised */
    void handleChild(OWLAnnotationPropertyElementHandler handler)
            throws OWLXMLParserException;

    /** @param handler
     *            element handler
     * @throws OWLXMLParserException
     *             if an error is raised */
    void handleChild(AbstractIRIElementHandler handler)
            throws OWLXMLParserException;

    /** @param chars
     *            chars to handle
     * @param start
     *            start index
     * @param length
     *            end index
     * @throws OWLXMLParserException
     *             if an error is raised */
    void handleChars(char[] chars, int start, int length)
            throws OWLXMLParserException;

    /** @param handler
     *            element handler
     * @throws OWLXMLParserException
     *             if an error is raised */
    void handleChild(SWRLVariableElementHandler handler)
            throws OWLXMLParserException;

    /** @param handler
     *            element handler
     * @throws OWLXMLParserException
     *             if an error is raised */
    void handleChild(SWRLAtomElementHandler handler)
            throws OWLXMLParserException;

    /** @param handler
     *            element handler
     * @throws OWLXMLParserException
     *             if an error is raised */
    void handleChild(SWRLAtomListElementHandler handler)
            throws OWLXMLParserException;

    /** @return text handled */
    String getText();

    /** @return true if text can be contained */
    boolean isTextContentPossible();
}
