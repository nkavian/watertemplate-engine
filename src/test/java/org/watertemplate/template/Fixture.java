package org.watertemplate.template;

public class Fixture {
    public static class MasterTemplate extends Template {
        protected String getTemplateFileURI() {
            return "_master_template.st";
        }
    }

    public static class SubTemplate extends Template {
        protected String getTemplateFileURI() {
            return "_sub_template.st";
        }
    }

    @org.watertemplate.template.StaticTemplate
    public static class StaticTemplate extends Fixture.SubTemplate {
    }
}
