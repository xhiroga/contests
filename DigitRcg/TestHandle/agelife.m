% 人生の半分が20歳だったとしたら

theta = sqrt(0.0125)

maxage = 80;
life= zeros(maxage,1);

for age = 0:1:maxage
  life(age+1,1) = theta*sqrt(age);
end

size(life)
disp(life)
plot(life);