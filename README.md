# liferay-playground
This repository contains liferay related projects that I would either like to share with others, or that are not directly part of a project I am working on.

# CKEditor - Customize toolbar
## CKEditor Configuration (frontend-editor-ckeditor-configuration )
This module allows you to change the configuration for the default CKEditor.
In particulair I made this to limit the number of styles a user can apply in the rich text editor through the toolbar.
It can also be used to add/remove other toolbar items.

See [CKEditorConfigContributor](https://github.com/liferay/liferay-portal/blob/master/modules/apps/frontend-editor/frontend-editor-ckeditor-web/src/main/java/com/liferay/frontend/editor/ckeditor/web/internal/editor/configuration/CKEditorConfigContributor.java) for a list of possible configurations.

The module contains an EditorConfigContributor component

## Export fragment ( frontend-editor-ckeditor-web-export-fragment )
This module exports the internal classes of the com.liferay.frontend.editor.ckeditor.web module.
 

