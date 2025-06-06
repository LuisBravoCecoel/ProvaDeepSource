package com.cecoel.proves;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JarFile {

	private static String regex = "(.*)(-)([\\d\\.(a-z)]*)(\\.jar)";
	private static Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	
	private String name;
	private String libName;
	private String version;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLibName() {
		return libName;
	}
	public void setLibName(String libName) {
		this.libName = libName;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	public JarFile(String libName) {
		this.libName = libName;
		System.out.println(libName);
		Matcher matcher = pattern.matcher(libName);
		if (matcher.matches()) {
			name = matcher.group(1);
			version = matcher.group(3);
		}
	}
	@Override
	public String toString() {
		return "JarFile [libName=" + libName + ", name=" + name + ", version=" + version + "]";
	}
}