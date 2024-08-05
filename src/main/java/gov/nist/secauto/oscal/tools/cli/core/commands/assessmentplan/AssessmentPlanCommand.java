/*
 * SPDX-FileCopyrightText: none
 * SPDX-License-Identifier: CC0-1.0
 */

package gov.nist.secauto.oscal.tools.cli.core.commands.assessmentplan;

import gov.nist.secauto.metaschema.cli.processor.command.AbstractParentCommand;

public class AssessmentPlanCommand
    extends AbstractParentCommand {
  private static final String COMMAND = "ap";

  public AssessmentPlanCommand() {
    super(true);
    addCommandHandler(new ValidateSubcommand());
    // addCommandHandler(new RenderSubcommand());
    addCommandHandler(new ConvertSubcommand());
  }

  @Override
  public String getName() {
    return COMMAND;
  }

  @Override
  public String getDescription() {
    return "Perform an operation on an OSCAL Assessment Plan";
  }
}