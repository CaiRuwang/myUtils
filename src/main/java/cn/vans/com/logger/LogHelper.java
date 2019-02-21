package cn.vans.com.logger;


import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.text.MessageFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogHelper {

	protected Logger logger = null;
	protected org.apache.logging.log4j.Logger saveUserOperatorLogger = null;

	public LogHelper(Class<?> clazz) {
		this.logger = LoggerFactory.getLogger(clazz);
	}

	public void debug(String msg) {
		logger.debug(msg);
	}

	public void debug(String format, Object... argArray) {
		if (logger.isDebugEnabled()) {
			String msg = MessageFormat.format(format, argArray);
			logger.debug(msg);
		}
	}

	public void debug(String msg, Throwable t) {
		logger.debug(msg, t);
	}

	public void info(String msg) {
		logger.info(msg);
	}

	public void info(String format, Object... argArray) {
		if (logger.isInfoEnabled()) {
			String msg = MessageFormat.format(format, argArray);
			logger.info(msg);
		}
	}

	public void info(String msg, Throwable t) {
		logger.info(msg, t);
	}

	public void warn(String msg) {
		logger.warn(msg);
	}

	public void warn(String format, Object... argArray) {
		if (logger.isWarnEnabled()) {
			String msg = MessageFormat.format(format, argArray);
			logger.warn(msg);
		}
	}

	public void warn(String msg, Throwable t) {
		logger.warn(msg, t);
	}

	public void error(String msg) {
		logger.error(msg);
	}

	public void error(String format, Object... argArray) {
		if (logger.isErrorEnabled()) {
			String msg = MessageFormat.format(format, argArray);
			logger.error(msg);
		}
	}

	public void error(String msg, Throwable t) {
		logger.error(msg, t);
	}

	public void error(Throwable t) {
		this.error("", t);
	}

	public boolean isDebugEnabled() {
		return logger.isDebugEnabled();
	}

	public boolean isInfoEnabled() {
		return logger.isInfoEnabled();
	}

	public boolean isWarnEnabled() {
		return logger.isWarnEnabled();
	}

	public boolean isErrorEnabled() {
		return logger.isErrorEnabled();
	}



	public static String getNotNullValue(String str) {
		if (StringUtils.isEmpty(str)) {
			return "";
		}
		return str;
	}


	public static String getBidIdOrPackageId(String type, String paramStr) {
		String patString = type + ".*?=(\\d+)";
		String result = "";
		Pattern pattern = Pattern.compile(patString);
		Matcher matcher = pattern.matcher(paramStr);
		if (-1 != paramStr.indexOf(type)) {
			while (matcher.find()) {
				if ("" != matcher.group(1) && null != matcher.group(1)) {
					result = matcher.group(1);
					break;
				}
			}
			return result;
		} else {
			return null;
		}

	}
}
