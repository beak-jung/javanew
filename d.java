public class d import subprocess

def get_saved_wifi_passwords():
profiles_data = subprocess.check_output(['netsh', 'wlan', 'show', 'profiles']).decode('utf-8')
profiles = [line.split(":")[1].strip() for line in profiles_data.split('\n') if "All User Profile" in line]

wifi_list = []

        for profile in profiles:
        try:
profile_info = subprocess.check_output(
                ['netsh', 'wlan', 'show', 'profile', profile, 'key=clear']
).decode('utf-8')
password_line = [line for line in profile_info.split('\n') if "Key Content" in line]
password = password_line[0].split(":")[1].strip() if password_line else "없음"
        wifi_list.append({"SSID": profile, "Password": password})
except subprocess.CalledProcessError:
        continue

        return wifi_list

# 사용 예시
for wifi in get_saved_wifi_passwords():
print(f"SSID: {wifi['SSID']} / Password: {wifi['Password']}"){
}
