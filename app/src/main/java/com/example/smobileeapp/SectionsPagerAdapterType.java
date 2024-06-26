package com.example.smobileeapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SectionsPagerAdapterType extends FragmentPagerAdapter {
    private final String problemType;
    private final String userIdToken;
    private final int how;

    public SectionsPagerAdapterType(@NonNull FragmentManager fm, String problemType, int how, String userIdToken) {
        super(fm);
        this.problemType = problemType;
        this.how = how;
        this.userIdToken = userIdToken;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        // 해당 위치에 따라 다른 프래그먼트를 반환
        switch (position) {
            case 0:
                return PlaceholderTypeFragment.newInstance(0, problemType, how, userIdToken); // 첫 번째 탭
            case 1:
                return PlaceholderTypeFragment.newInstance(1, problemType, how, userIdToken); // 두 번째 탭
            case 2:
                return PlaceholderTypeFragment.newInstance(2, problemType, how, userIdToken); // 세 번째 탭
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        // 총 페이지 수는 3개
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // 각 탭의 제목을 반환
        switch (position) {
            case 0:
                return "등록 시간 순";
            case 1:
                return "문제 번호 순";
            case 2:
                return "문제 난이도 순";
            default:
                return null;
        }
    }
}