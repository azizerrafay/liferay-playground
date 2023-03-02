package com.custom.ckeditor.configuration;



import com.liferay.frontend.editor.ckeditor.web.internal.editor.configuration.BaseCKEditorConfigContributor;
import com.liferay.portal.kernel.editor.configuration.EditorConfigContributor;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.RequestBackedPortletURLFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;

import java.util.Map;

import org.osgi.service.component.annotations.Component;

import jdk.nashorn.api.scripting.JSObject;

/**
 * @author aziz.er-rafay@finalist.nl
 */
@Component(
	immediate = true,
	property = {
			"service.ranking:Integer=100",
			"editor.name=ckeditor", 
			"editor.name=ckeditor_classic"
	},
	service = EditorConfigContributor.class
)
public class CustomCKEditorEditorConfigContributor extends BaseCKEditorConfigContributor  {

	@Override
	public void populateConfigJSONObject(JSONObject jsonObject, Map<String, Object> inputEditorTaglibAttributes,
			ThemeDisplay themeDisplay, RequestBackedPortletURLFactory requestBackedPortletURLFactory) {

		JSONArray stylesSet = JSONFactoryUtil.createJSONArray();
		try {
			stylesSet.put(JSONFactoryUtil.createJSONObject("{\"name\":\"Normal\",\"element\":\"p\"}"));
			stylesSet.put(JSONFactoryUtil.createJSONObject("{\"name\":\"Heading 2\",\"element\":\"h2\"}"));

		} catch (JSONException e) {
			log.error("Error adding allowed styles in json ", e);
		}

		jsonObject.put("stylesSet", stylesSet);

		
	}

	private final com.liferay.portal.kernel.log.Log log = LogFactoryUtil
			.getLog(CustomCKEditorEditorConfigContributor.class);



}