package com.loops101.icons;

import com.intellij.ide.IconProvider;
import com.intellij.openapi.util.IconLoader;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class GoIconProvider extends IconProvider {

    private static final String SOURCE_URL = "/com/loops101/icons/go.png";
    private static final String TEST_URL = "/com/loops101/icons/go-test.png";

    public Icon getIcon(@NotNull PsiElement psiElement, int flags) {
        PsiFile containingFile = psiElement.getContainingFile();
        if (containingFile != null) {
            String fileName = containingFile.getName();
            if (fileName.endsWith(".go")) {
                if (fileName.endsWith("_test.go")) {
                    return IconLoader.getIcon(TEST_URL);
                } else {
                    return IconLoader.getIcon(SOURCE_URL);
                }
            }
        }
        return null;
    }
}