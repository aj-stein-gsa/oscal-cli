/*
 * SPDX-FileCopyrightText: none
 * SPDX-License-Identifier: CC0-1.0
 */

package gov.nist.secauto.oscal.tools.cli.core.commands.catalog;

import gov.nist.secauto.metaschema.core.model.IBoundObject;
import gov.nist.secauto.oscal.lib.model.Catalog;
import gov.nist.secauto.oscal.tools.cli.core.commands.AbstractOscalConvertSubcommand;

public class ConvertSubcommand
    extends AbstractOscalConvertSubcommand {

  @Override
  public String getDescription() {
    return "Convert the specified OSCAL Catalog to a different format";
  }

  @Override
  public Class<? extends IBoundObject> getOscalClass() {
    return Catalog.class;
  }
}